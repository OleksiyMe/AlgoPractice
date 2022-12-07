package MissingNumber;

import java.util.Arrays;

public class _1stTry {

    public static void main(String[] args) {

        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println("Here is our array\n" + Arrays.toString(arr));
        System.out.println("The missing number is " + missingNumber(arr));


    }

    private static int missingNumber(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) return i;
        }
        return nums.length;
    }

}
