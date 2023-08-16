package Maryna;

import java.util.*;


public class SortMapByValues {
    //Write a method that can sort the Map by values.

    public static void main(String[] args) {
        //creating test map with test entries
        Map<Character, Integer> inputMap = new HashMap<>();
        inputMap.put('A', 8);
        inputMap.put('B', 100);
        inputMap.put('C', 56);
        inputMap.put('D', 2);
        inputMap.put('E', 2);
        inputMap.put('F', 100);

        System.out.println("We had: " + inputMap);
        System.out.println("We get: " + sortByValue(inputMap));
    }

    private static Map<Character, Integer> sortByValue(Map<Character, Integer> inputMap) {
//let's create list with all values of the inputMap
        List<Integer> list = new ArrayList<>(inputMap.values());
        //let's sort elements of our list in ascending order
        list.sort(Integer::compare);
//let's create result Map with LinkedHashMap() implementation (as if we need to preserve order of entries)
        Map<Character, Integer> result = new LinkedHashMap<>();
//in outer loop we iterate through sorted values
        for (Integer currentSortedValue : list) {
            //in inner loop we add each entry with value equal currentSortedValue to our result Map
            for (Map.Entry<Character, Integer> eachEntry : inputMap.entrySet()) {
                if (eachEntry.getValue().equals(currentSortedValue))
                    result.put(eachEntry.getKey(), eachEntry.getValue());
            }
        }
        return result;
    }

}
