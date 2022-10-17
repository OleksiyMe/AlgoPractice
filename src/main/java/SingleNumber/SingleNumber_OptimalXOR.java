package SingleNumber;

import java.util.HashMap;

public class SingleNumber_OptimalXOR {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));

    }

    public static int singleNumber(int[] nums) {
        int res = 0;
        for (int x : nums) {
            res ^= x;
        }
        return res;

    }
}
