package b123.hlam;

import java.util.*;
import java.util.stream.Collectors;

public class Stream_NumberOfUniqueBooks {
    public static void main(String[] args) {

        List<Integer> books = new ArrayList<>(
                Arrays.asList(1, 3, 5, 2, 3, 7, 9, 2, 6, 0, 7)
        );
        long numberOfUnique = books.stream().distinct().count();
        Map<Integer, Long> freqMap = books.stream()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1,e2)->e1.getValue()<= e2.getValue()?-1:1)
                .collect(Collectors.toMap(e->e.getKey(), e->e.getValue(),(oldV,newV)->oldV,LinkedHashMap::new));


        System.out.println("Frequency map "+freqMap);
        System.out.println(
                "Number of unique books is " + numberOfUnique);
        System.out.println(
                "Their numbers are " +
                        books.stream().distinct().collect(Collectors.toList()));


    }
}
