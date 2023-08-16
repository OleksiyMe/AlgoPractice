package zeroesToEnd;

import java.util.Arrays;

public class MoveZeroesToEndByDiana {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 2, 0, 0, 7};
        System.out.println(Arrays.toString(moveZeroes(arr)));
    }

    public static int[] moveZeroes(int[] nums){

        int indexOfFirstZeroElement = 0;
        int tmp = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                tmp = nums[indexOfFirstZeroElement];
                nums[indexOfFirstZeroElement] = nums[i];
                nums[i] = tmp;
                indexOfFirstZeroElement++;
            }
        }
        return nums;
    }
}