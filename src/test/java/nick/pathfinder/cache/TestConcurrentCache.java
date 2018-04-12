package nick.pathfinder.cache;

import nick.pfinder.cache.PfinderCache;
import nick.pfinder.cache.impl.PfinderCharacterCacheImpl;
import nick.pfinder.model.character.BaseCharacter;
import nick.pfinder.model.character.Character;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

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
    public void testInsertAtMaxRemovesOneWithMostTimeSinceLastAccessed() throws InterruptedException {
        UUID oldest = UUID.randomUUID();
        cache.insert(oldest, new TestCharacter());
        assertNotNull(cache.get(oldest));
        Thread.sleep(5000);
        for(int i = 1; i < MAX_IN_CACHE; i++){
            cache.insert(UUID.randomUUID(), new TestCharacter());
        }
        assertEquals(cache.getCacheSize(), MAX_IN_CACHE);
        cache.insert(UUID.randomUUID(), new TestCharacter());
        assertNull(cache.get(oldest));
    }

    @Test
    public void testThreadBlockedOnSecondAccessCallToIdUntilManuallyReleased() throws InterruptedException {
        UUID id = UUID.randomUUID();
        cache.insert(id, new TestCharacter());
        assertNotNull(cache.get(id));
        Thread secondAccess = new Thread(() -> cache.get(id));
        secondAccess.start();
        Thread.sleep(3000);
        assertTrue(secondAccess.getState().equals(Thread.State.WAITING));
        cache.doneEditing(id);
        Thread.sleep(3000);
        assertTrue(secondAccess.getState().equals(Thread.State.TERMINATED));
    }

    @Test
    public void testThreadDoesNotBlockOnMultipleAccessCallsToDifferentIds() throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        for(int i = 0; i < MAX_IN_CACHE; i++){
            Thread thread = new Thread(() -> {
                UUID id = UUID.randomUUID();
                cache.insert(id, new TestCharacter());
                cache.get(id);
            });
            thread.start();
        }
        Thread.sleep(6000);
        for(Thread t : threads){
            assertTrue(t.getState().equals(Thread.State.TERMINATED));
        }
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

        @Override
        public List<String> getClassSkills() {
            return null;
        }
    }


}
