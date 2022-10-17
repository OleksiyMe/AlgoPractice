package SingleNumber;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class SingleNumber_FirstTry {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));

    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int eachNum : nums) {
            map.put(eachNum, map.getOrDefault(eachNum, 0) + 1);
            if (map.get(eachNum) > 1) map.remove(eachNum);
        }
        return (Integer) map.keySet().toArray()[0];

    }
}
