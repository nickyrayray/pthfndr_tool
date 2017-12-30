package nick.pfinder.cache;

public interface PfinderCache<K, V> {

    void refresh();

    void insert(K key, V value);

    V get(K key);

    void doneEditing(K key);
}
