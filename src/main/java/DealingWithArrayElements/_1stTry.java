package DealingWithArrayElements;

import java.util.Arrays;

public class _1stTry {

    public static void main(String[] args) {

        int[] array = {2, 3, 4, 5, 6};

        System.out.println("Input " + Arrays.toString(array));
        System.out.println("Output " + Arrays.toString(dealWithIt(array)));

    }

    private static int[] dealWithIt(int[] array) {

        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                result[i] = array[0] * array[1];
                continue;
            }
            if (i == array.length - 1) {
                result[i] = array[array.length - 1] * array[array.length - 2];
                continue;
            }
            result[i] = array[i - 1] * array[i + 1];
        }

        return result;
    }

}
