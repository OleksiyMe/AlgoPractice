package a123.LRUcache;

import java.util.*;

class MyLRUcache3 {

    private Map<Integer, Integer> map = new HashMap<>();
    private final Integer capacity;

    Queue<Integer> ll= new LinkedList<>();

    public MyLRUcache3(int capacity) {
        if (capacity < 1) throw new IllegalArgumentException("cacheSize must be greater or equal 1");
        this.capacity = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            ll.remove(key);
            ll.add(key);
            return map.get(key);
        } else return -1;
    }

    public void put(int key, int value) {
        if (!map.containsKey(key) && map.size() == capacity) {
            map.remove(ll.poll());
        }
        if (map.containsKey(key)) ll.remove(key);
        ll.add(key);
        map.put(key, value);
    }

}