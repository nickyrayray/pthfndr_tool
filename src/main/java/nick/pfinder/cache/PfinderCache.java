package nick.pfinder.cache;

public interface PfinderCache<K, V> {

    void refresh();

    V evict(K key);

    void insert(K key, V value);

    V get(K key);
}
