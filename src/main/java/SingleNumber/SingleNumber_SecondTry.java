package SingleNumber;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class SingleNumber_SecondTry {
    public static void main(String[] args) {
        int[] nums = {-4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));

    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int eachNum : nums) {
            map.put(eachNum, map.getOrDefault(eachNum, 0) + 1);
            if (map.get(eachNum) > 1) map.remove(eachNum);
        }
        for (Integer eachKey : map.keySet()) {
            return eachKey;
        }
        return 0;
       // return  map.keySet().stream().findFirst().get();
    }
}
