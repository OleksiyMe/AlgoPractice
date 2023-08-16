package zeroesToEnd;

import java.util.Arrays;

public class ZeroesToEndByMe {

    public static void main(String[] args) {
        int[] given = {1, 0, 0, 0, 0, 2, 2, 2, 0, 0, 7};
        System.out.println(Arrays.toString(moveZerosToEnd(given)));
    }

    private static int[] moveZerosToEnd(int[] nums) {

        int pointer1 = 0, pointer2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && nums[pointer1] != 0) pointer1 = i;
            if (nums[i] != 0) pointer2 = i;
            if (pointer2 > pointer1) {
                nums[pointer1] = nums[pointer2];
                nums[pointer2] = 0;
                pointer1++;
                pointer2 = 0;
            }
        }
        return nums;
    }


}

