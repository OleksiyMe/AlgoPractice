package a123.LRUcache;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class MyLRUcache2 {

    private Map<Integer, Integer[]> map = new HashMap<>();
    private TreeMap<Integer, Integer> lastAccessMap = new TreeMap<>();
    private final Integer capacity;
    private Integer maxLastAccessTimeIndex;


    public MyLRUcache2(int capacity) {
        if (capacity < 1) throw new IllegalArgumentException("cacheSize must be greater or equal 1");
        this.capacity = capacity;
        maxLastAccessTimeIndex = Integer.MIN_VALUE;
    }

    public int get(int key) {
        if (map.containsKey(key)) {

            map.get(key)[1] = ++maxLastAccessTimeIndex;
            lastAccessMap.entrySet().removeIf(e->e.getValue().equals(key));
            lastAccessMap.put(maxLastAccessTimeIndex, key);
            return map.get(key)[0];
        } else return -1;
    }

    public void put(int key, int value) {
        if (!map.containsKey(key) && map.size() == capacity) {
            map.remove(lastAccessMap.get(lastAccessMap.firstKey()));
            lastAccessMap.remove(lastAccessMap.firstKey());
        }
        Integer[] newEntry = new Integer[2];
        newEntry[0] = value;
        newEntry[1] = ++maxLastAccessTimeIndex;
        lastAccessMap.entrySet().removeIf(e->e.getValue().equals(key));
        lastAccessMap.put(maxLastAccessTimeIndex, key);
        map.put(key, newEntry);
    }


}