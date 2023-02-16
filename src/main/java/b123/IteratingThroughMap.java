package b123;

import com.github.javafaker.Faker;

import java.util.*;

public class IteratingThroughMap {

    public static void main(String[] args) {
        Faker faker = new Faker();

        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {

            map.put(i, faker.animal().name());
        }

        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry entry = it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("===========");
        Iterator<Integer> itKeySet = map.keySet().iterator();
        while (itKeySet.hasNext()) {
            int key = itKeySet.next();
            System.out.println(key + ": " + map.get(key));
        }
        System.out.println("=================");
        Iterator<String> itVal = map.values().iterator();
        while (itVal.hasNext()) {
            String value = itVal.next();
            System.out.println(" map contains value " + value + " -- is " + map.containsValue(value));

        }
        System.out.println("======stream PARALLEL EXAMPLE=============");

        map.entrySet().stream().parallel().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

        System.out.println("======stream STRAIGHT EXAMPLE=============");

        map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

        System.out.println("++++++++++++");

        for (Map.Entry<Integer, String> each : map.entrySet()) {
            System.out.println(each.getKey()+ " "+each.getValue());

        }

    }

}
