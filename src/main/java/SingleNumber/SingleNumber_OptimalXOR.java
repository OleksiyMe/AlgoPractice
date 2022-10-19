package SingleNumber;

import java.util.HashMap;

public class SingleNumber_OptimalXOR {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 2, 4};
        System.out.println(singleNumber(nums));

    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int eachNum : nums) {
            result ^= eachNum;
        }
        return result;

    }
}
