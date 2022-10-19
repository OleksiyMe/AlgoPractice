package SingleNumber;

import java.util.HashSet;
import java.util.Set;

public class SingleNumberFourthTry {
    public static void main(String[] args) {
        int[] nums = {-4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));

    }

    private static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sumOfAllElements = 0;
        int sumOfUniqueElements = 0;

        for (int i = 0; i < nums.length; i++) {
            if (set.add(nums[i]))   sumOfUniqueElements += nums[i];
            sumOfAllElements += nums[i];
        }
        return 2 * sumOfUniqueElements - sumOfAllElements;
    }

/*4,1,1,2,2

    4+1+2  = 7
    10
    14 -10 = 4*/


}
