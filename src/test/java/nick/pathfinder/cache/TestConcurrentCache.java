package nick.pathfinder.cache;

import nick.pfinder.cache.PfinderCache;
import nick.pfinder.cache.impl.PfinderCharacterCacheImpl;
import nick.pfinder.model.character.BaseCharacter;
import nick.pfinder.model.character.Character;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static org.junit.Assert.*;

public class TestConcurrentCache {

    Map<UUID, Long> memoryAccessLog;
    PfinderCache<UUID, Character> cache;
    static final Integer MAX_IN_CACHE = 5;
    static final Long TTL_IN_MILLIS = 10000000L;

    @Before
    public void setup(){
        memoryAccessLog = new HashMap<>();
        cache = new PfinderCharacterCacheImpl(MAX_IN_CACHE, TTL_IN_MILLIS);
    }

    @Test
    public void testMultipleThreadsCanManipulateTheCache() throws InterruptedException {
        UUID uuid1 = UUID.randomUUID();
        UUID uuid2 = UUID.randomUUID();
        Thread insertOne = new Thread(() -> cache.insert(uuid1, new TestCharacter()));

        Thread insertTwo = new Thread(() -> cache.insert(uuid2, new TestCharacter()));

        insertOne.start();
        insertTwo.start();

        Thread.sleep(10000);

        assertNotNull(cache.get(uuid1));
        assertNotNull(cache.get(uuid2));
    }

    @Test
    public void testInsertingManyOverCacheSizeKeepsAConstantNumber(){
        for(int i = 0; i < MAX_IN_CACHE * 3; i++){
            cache.insert(UUID.randomUUID(), new TestCharacter());
        }
        assertEquals(cache.getCacheSize(), MAX_IN_CACHE);
    }

    @Test
    public void testInsertAtMaxRemovesOneWithMostTimeSinceLastAccessed(){
        UUID oldest = UUID.randomUUID();
        cache.insert(oldest, new TestCharacter());
        assertNotNull(cache.get(oldest));
        for(int i = 1; i < MAX_IN_CACHE; i++){
            cache.insert(UUID.randomUUID(), new TestCharacter());
        }
        assertEquals(cache.getCacheSize(), MAX_IN_CACHE);
        cache.insert(UUID.randomUUID(), new TestCharacter());
        assertNull(cache.get(oldest));
    }


    class TestCharacter extends BaseCharacter {

        UUID id;

        @Override
        public UUID getCacheId() {
            return id;
        }

        @Override
        public void setCacheId(UUID id) {
            this.id = id;
        }
    }


}
