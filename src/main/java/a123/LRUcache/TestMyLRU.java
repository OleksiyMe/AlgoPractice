package a123.LRUcache;

public class TestMyLRU {
    public static void main(String[] args)  throws InterruptedException {

        MyLRUcacheInterestingExampleFromLeet lru=new MyLRUcacheInterestingExampleFromLeet( 2);

        lru.put(2,1);
        lru.put(1,1);
        lru.put(2,3);
        lru.put(4,1);
        System.out.println(lru.get(1));
        System.out.println(lru.get(2));



    }
}
