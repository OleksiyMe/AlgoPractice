package a123.LRUcache;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class MyLRUcacheInterestingExampleFromLeet extends LinkedHashMap<Integer,Integer> {
    private int maxSize;

    public MyLRUcacheInterestingExampleFromLeet(int capacity) {
        super(capacity, 0.75f, true);
        this.maxSize = capacity;
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> entry) {
        return size() > maxSize;
    }
}