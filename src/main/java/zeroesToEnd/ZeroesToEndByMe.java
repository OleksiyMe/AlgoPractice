package zeroesToEnd;

import java.util.Arrays;

public class ZeroesToEndByMe {

    public static void main(String[] args) {
        int[] given = {1, 0, 0, 0, 0, 2, 2, 2, 0, 0, 7};
        System.out.println(Arrays.toString(moveZerosToEnd(given)));
    }

    private static int[] moveZerosToEnd(int[] array) {

        int pointer1 = 0, pointer2 = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0 && array[pointer1] != 0) pointer1 = i;
            if (array[i] != 0) pointer2 = i;
            if (pointer2 > pointer1) {
                array[pointer1] = array[pointer2];
                array[pointer2] = 0;
                pointer1++;
                pointer2 = 0;
            }
        }
        return array;
    }


}

