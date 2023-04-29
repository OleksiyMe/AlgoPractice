package interview.CityBank.javacore;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionDemo {

    public static void main(String[] args) {
        List< KeyValue<String,String>> list=new ArrayList<>();
        Map<String, String> map=new HashMap<>();
    }


    private static class KeyValue<K,V>{
        private K key;
        private V value;

        public KeyValue(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
