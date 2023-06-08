package a11;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {

        int[] input = {1, -2, -5, 10, -9, 10};
        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(sort(input)));
        System.out.println(Arrays.toString( Arrays.copyOfRange(input,4, input.length)  ));
    }

    private static int[] sort(int[] input) {

        boolean isChanged = true;

        while (isChanged) {
            isChanged = false;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    isChanged = true;
                }
            }
        }
        return input;

    }
}
