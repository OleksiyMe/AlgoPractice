package zeroesToEnd;

import java.util.Arrays;

public class MoveZeroesToEndByDiana {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 2, 0, 0, 7};
        System.out.println(Arrays.toString(moveZeroes(arr)));
    }

    public static int[] moveZeroes(int[] arr){

        int pointer1 = 0;
        int pointer2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                pointer2 = arr[pointer1];
                arr[pointer1] = arr[i];
                arr[i] = pointer2;
                pointer1++;
            }
        }
        return arr;
    }
}