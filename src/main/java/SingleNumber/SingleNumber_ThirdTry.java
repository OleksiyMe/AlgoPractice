package SingleNumber;

import java.util.Arrays;
import java.util.HashMap;

public class SingleNumber_ThirdTry {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));

    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int result = 0, length=nums.length;
        for (int i = 0; i < length; i += 2) {
            if ((i+1)<length && nums[i] == nums[i+1]) continue;
            result = nums[i];
            break;
        }
        return result;
    }
}
