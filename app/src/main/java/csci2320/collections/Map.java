package csci2320.collections;

import java.util.Iterator;

public interface Map<K, V> {
    V get(K key);
    void put(K key, V value);
    V remove(K key);
    boolean contains(K key);
    int size();
    Iterator<K> iterator();
}
