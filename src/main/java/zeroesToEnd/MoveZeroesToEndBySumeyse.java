package zeroesToEnd;

import java.util.Arrays;

public class MoveZeroesToEndBySumeyse {
    public static void main(String[] args) {
        int[] given = {0, 1, 0, 0, 0, 2, 2, 2, 0, 0, 7};
        System.out.println(Arrays.toString(moveZeroesToEnd(given)));
    }

    public static int[] moveZeroesToEnd(int[] nums) {

        int fast = 0, slow = 0;
        while (fast < nums.length - 1) {

            if (nums[slow] != 0) {
                slow++;
            }
            if (fast <= slow || nums[fast] == 0) {
                fast++;
            }
            if (nums[slow] == 0 && nums[fast] != 0) {
                nums[slow] = nums[fast];
                nums[fast] = 0;
            }
        }
        return nums;
    }
}
