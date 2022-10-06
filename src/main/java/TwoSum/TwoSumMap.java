package TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumMap {
    public static void main(String[] args) {

        Integer[] arr = {16, 3, 11, 5, 15};
        Integer target = 8;
        System.out.println(Arrays.toString( returnTwoIndices(arr, target) ));
    }

    private static Integer[] returnTwoIndices(Integer[] arr, Integer target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i]))
                return new Integer[]{map.get(target - arr[i]),i};
            else map.put(arr[i], i);
        }
        return new Integer[] {};
    }

    private static Integer[] returnTwoElements(Integer[] arr, Integer target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) return new Integer[]{target - arr[i],arr[i]};
            else map.put(arr[i], i);
        }
        return new Integer[] {};
    }

}

/*
* Given an array of integers nums and an integer target, return indices of the two numbers such
* that they add up to target.
* */


