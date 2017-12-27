package nick.pfinder.cache.impl;

import nick.pfinder.cache.PfinderCache;
import nick.pfinder.model.character.Character;

import java.util.*;

public class PfinderCharacterCacheImpl implements PfinderCache<UUID, Character> {

    private Map<UUID, CacheMetadataWrapper> characters;
    private Set<UUID> currentlyAccessed;

    private static final Object CHARACTER_LOCK = new Object();
    private static final Object EDITOR_LOCK = new Object();
    private static final Integer MAX_IN_CACHE = 30;
    private static final Long TTL_IN_MILLIS = 600000L;

    public PfinderCharacterCacheImpl(){
        this.characters = new HashMap<>();
        this.currentlyAccessed = new HashSet<>();
    }

    @Override
    public void refresh() {
        synchronized (CHARACTER_LOCK){

        }
    }

    @Override
    public Character evict(UUID key) {
        return null;
    }

    @Override
    public void insert(UUID key, Character value){
        synchronized (CHARACTER_LOCK){
            CacheMetadataWrapper cacheMetadataWrapper = characters.get(key);
            if(cacheMetadataWrapper != null){
                cacheMetadataWrapper.update();
            } else {
                cacheMetadataWrapper = new CacheMetadataWrapper(value);
                characters.put(key, cacheMetadataWrapper);
            }
        }
    }

    @Override
    public Character get(UUID key) {
        synchronized (CHARACTER_LOCK){
            CacheMetadataWrapper cacheMetadataWrapper = characters.get(key);
            if(cacheMetadataWrapper != null){
                synchronized (EDITOR_LOCK){
                    if(!currentlyAccessed.contains(key)){
                        currentlyAccessed.add(key);
                        cacheMetadataWrapper.update();
                        return cacheMetadataWrapper.getCharacter();
                    } //TODO: Throw exception if it is being edited already
                }
            } // TODO: Handle case where the character is not in the cache
        }
        return null;
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

        void update(){
            this.lastAccessed = System.currentTimeMillis();
        }

        Long getLastAccessed(){
            return this.lastAccessed;
        }
    }
}
