package a123.LRUcache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class MyLRUcache1 {
    private Map<Integer, LRU_entry> map = new HashMap<>();

    private final Integer cacheSize;
    private Integer maxLastAccessTimeIndex, keyToDelete;

    public MyLRUcache1(Integer cacheSize) {
        if (cacheSize < 1) throw new IllegalArgumentException("cacheSize must be greater or equal 1");
        this.cacheSize = cacheSize;
        maxLastAccessTimeIndex = Integer.MIN_VALUE;
    }



    public void put(Integer key, Integer value) {


        if (map.containsKey(key)) {
            LRU_entry newEntry = map.get(key);
            newEntry.setValue(value);
            newEntry.setTimeWhenUsed(++maxLastAccessTimeIndex);
            map.replace(key, newEntry);
        } else
            deleteLessUsed();
        map.put(key, new LRU_entry(value, ++maxLastAccessTimeIndex));
    }

    public Integer get(Integer key) {
        if (map.containsKey(key)) {
            return map.get(key).getValue(++maxLastAccessTimeIndex);
        } else return -1;
    }

    private void deleteLessUsed() {
        if (map.size() < cacheSize) return;
        Integer minTimeLastUse = Integer.MAX_VALUE;

        for (Map.Entry<Integer, LRU_entry> entry : map.entrySet()) {
            if (entry.getValue().getTimeWhenUsed() < minTimeLastUse) {
                minTimeLastUse = entry.getValue().getTimeWhenUsed();
                keyToDelete = entry.getKey();
            }
        }
        map.remove(keyToDelete);
    }
}
