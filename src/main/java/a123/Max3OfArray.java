package a123;

import java.util.Arrays;

public class Max3OfArray {

    public static void main(String[] args) {

        int[] array = {1, 4, 7, 0, 99};
        System.out.println(Arrays.toString(max3(array)));
    }

    private static int[] max3(int[] array) {

        int max = Integer.MIN_VALUE, index1 = -1, index2 = -1, index3 = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index1 = i;
            }
        }
        max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max && i != index1) {
                max = array[i];
                index2 = i;
            }
        }



        max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max && i != index1 && i != index2) {
                max = array[i];
                index3 = i;
            }
        }
        if (index1 < 0 || index2 < 0 || index3 < 0) return new int[]{};
        return new int[]{array[index1], array[index2], array[index3]};
    }
}
