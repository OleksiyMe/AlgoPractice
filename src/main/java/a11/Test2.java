package a11;

import net.jcip.annotations.ThreadSafe;
import org.apache.commons.collections4.KeyValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {

        List<KeyValue<String,Integer>> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(new KeyValue<>("It's "+i,i));

        }
        System.out.println(list);
        throw new Error("And so we are here :)");
    }

    @ThreadSafe
    public final static class KeyValue<K, V> {
        private final K key;
        private final V value;

        public KeyValue(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{" + key +
                    " : =" + value +
                    '}';
        }

        public K getKey() {
            return key;
        }
        public V getValue(){
            return value;
        }

    }



}
