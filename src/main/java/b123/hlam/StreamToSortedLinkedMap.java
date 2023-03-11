package b123.hlam;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamToSortedLinkedMap {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(
                1, 2, 3, 41, 11, 1, 1, 67, 4, 5, 2, 44, 11));

        Map<Integer, Long> map = list.stream()
                .collect(Collectors.groupingBy(p -> p, Collectors.counting()));

        Map<Integer,Long> mapSortrdByValue=map.entrySet().stream()
                .sorted((a,b)->a.getValue()<=b.getValue()?-1:1)
                .collect(Collectors.toMap(k->k.getKey(),v->v.getValue(),
                        (eOld,eNew)->eNew, LinkedHashMap::new)  );

        System.out.println(map);
        System.out.println(mapSortrdByValue);

    }


}
