package a123.LRUcache;

import java.util.HashMap;
import java.util.Map;

class MyLRUcache {

    private Map<Integer, Integer[] > map = new HashMap<>();
    private final Integer capacity;
    private Integer maxLastAccessTimeIndex;

    public MyLRUcache(int capacity) {
    if (capacity < 1) throw new IllegalArgumentException("cacheSize must be greater or equal 1");
        this.capacity = capacity;
        maxLastAccessTimeIndex = Integer.MIN_VALUE;
     }
    
    public int get(int key) {
      if (map.containsKey(key)) {
            map.get(key)[1]=++maxLastAccessTimeIndex;
            return map.get(key)[0];
        } else return -1;  
    }
    
    public void put(int key, int value) {
        if (!map.containsKey(key)) deleteOldest();
        Integer[] newEntry = new Integer[2];
        newEntry[0]=value;
        newEntry[1]=++maxLastAccessTimeIndex;
        map.put(key, newEntry);  
    }

    private void deleteOldest() {
        if (map.size() < capacity) return;
        Integer minTimeLastUse = Integer.MAX_VALUE, keyOfMinTime = null;

        for (Map.Entry<Integer, Integer[]> entry : map.entrySet()) {
            if (entry.getValue()[1] < minTimeLastUse) {
                minTimeLastUse = entry.getValue()[1];
                keyOfMinTime = entry.getKey();
            }
        }
        map.remove(keyOfMinTime);
    }

}