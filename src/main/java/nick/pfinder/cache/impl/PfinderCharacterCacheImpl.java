package nick.pfinder.cache.impl;

import nick.pfinder.cache.PfinderCache;
import nick.pfinder.model.character.Character;

import java.util.*;

public class PfinderCharacterCacheImpl implements PfinderCache<UUID, Character> {

    private Map<UUID, CacheMetadataWrapper> characters;
    private Set<UUID> currentlyAccessed;

    private static final Object EDITOR_LOCK = new Object();
    private final Integer MAX_IN_CACHE;
    private final Long TTL_IN_MILLIS;

    public PfinderCharacterCacheImpl(Integer MAX_IN_CACHE, Long TTL_IN_MILIS){
        this.characters = new HashMap<>();
        this.currentlyAccessed = new HashSet<>();
        this.MAX_IN_CACHE = MAX_IN_CACHE;
        this.TTL_IN_MILLIS = TTL_IN_MILIS;
    }

    @Override
    public synchronized void refresh() {
        refreshImpl();
    }

    @Override
    public synchronized void insert(UUID key, Character value){
        CacheMetadataWrapper cacheMetadataWrapper = characters.get(key);
        if(cacheMetadataWrapper != null){
            cacheMetadataWrapper.update();
        } else {
            if(characters.size() >= MAX_IN_CACHE){
                refreshImpl();
            }
            if(characters.size() >= MAX_IN_CACHE){
                freeUpSpaceIfNeeded();
            }
            cacheMetadataWrapper = new CacheMetadataWrapper(value);
            characters.put(key, cacheMetadataWrapper);
        }
    }

    @Override
    public Character get(UUID key) {
        CacheMetadataWrapper cacheMetadataWrapper;
        synchronized (this) {
            cacheMetadataWrapper = characters.get(key);
            if(cacheMetadataWrapper != null){
                cacheMetadataWrapper.update();
            }
        }
        if(cacheMetadataWrapper != null){
            synchronized (EDITOR_LOCK) {
                while (currentlyAccessed.contains(key)) {
                    try {
                        EDITOR_LOCK.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        return null;
                    }
                }
                currentlyAccessed.add(key);
            }
            return cacheMetadataWrapper.getCharacter();
        }
        return null;
    }

    @Override
    public void doneEditing(UUID key) {
        synchronized (EDITOR_LOCK){
            if(currentlyAccessed.contains(key)){
                currentlyAccessed.remove(key);
            } else {
                //TODO: LOG WEIRD BEHAVIOR
            }
            EDITOR_LOCK.notify();
        }
    }

    @Override
    public synchronized Integer getCacheSize() {
        return characters.size();
    }

    private void evict(UUID key) {
        characters.remove(key);
    }

    private void freeUpSpaceIfNeeded(){
        if(characters.size() >= MAX_IN_CACHE){
            refresh();
            if(characters.size() >= MAX_IN_CACHE){
                UUID keyOfOldest = findKeyOfOldest();
                evict(keyOfOldest);
            }
        }
    }

    private UUID findKeyOfOldest(){
        Optional<Map.Entry<UUID, CacheMetadataWrapper>> minUUID = characters.entrySet()
                .stream()
                .min(Comparator.comparingLong(e -> e.getValue().getLastAccessed()));
        if(minUUID.isPresent()){
            return minUUID.get().getKey();
        }
        return null;
    }

    private void refreshImpl(){
        characters.entrySet().forEach(e -> {
            CacheMetadataWrapper cacheMetadataWrapper = e.getValue();
            if((System.currentTimeMillis() - cacheMetadataWrapper.getLastAccessed()) >= TTL_IN_MILLIS){
                characters.remove(e.getKey());
                synchronized (EDITOR_LOCK){
                    if(currentlyAccessed.contains(e.getKey())){
                        currentlyAccessed.remove(e.getKey());
                    }
                }
            }
        });
    }

    private class CacheMetadataWrapper{
        Long lastAccessed;
        Character character;

        CacheMetadataWrapper(Character character){
            this.lastAccessed = System.currentTimeMillis();
            this.character = character;
        }

        Character getCharacter() {
            return character;
        }

        synchronized void update(){
            this.lastAccessed = System.currentTimeMillis();
        }

        synchronized Long getLastAccessed(){
            return this.lastAccessed;
        }
    }
}
