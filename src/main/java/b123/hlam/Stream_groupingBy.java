package b123.hlam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream_groupingBy {
    public static void main(String[] args) {

        List<Integer> testList = new ArrayList<>(Arrays.asList(1, 8, 8, 5, 6, 7, 5, 7)),
                result;
        System.out.println("Num of Elements " + testList.stream().collect(Collectors.counting()));
        System.out.println("Num of Elements " + testList.stream().count());
        System.out.println("Num of Elements " + testList.size());

//        System.out.println(testList.stream().distinct().toList());
//       testList.removeAll(testList.stream().distinct().toList()) ;
//        System.out.println(testList);


        Map<Integer, Long> testMap = testList.stream()
                .collect(Collectors.groupingBy(element -> element, Collectors.counting()));
        testList = testMap.entrySet().stream()
                .filter((e) -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println("Duplicate elements "+testList);


    }
}
