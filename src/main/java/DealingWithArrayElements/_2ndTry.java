package DealingWithArrayElements;

import java.util.Arrays;

public class _2ndTry {

    public static void main(String[] args) {

        int[] array = {2, 3, 4, 5, 6};

        System.out.println("Input " + Arrays.toString(array));
        System.out.println("Output " + Arrays.toString(dealWithIt(array)));

    }

    private static int[] dealWithIt(int[] array) {

        int length = array.length;
        int first = array[0] * array[1],
                last = array[length - 2] * array[length - 1],
                prev = array[0];

        for (int i = 1; i < length - 1; i++) {
            int prevTmp = array[i];
            array[i] = prev * array[i + 1];
            prev = prevTmp;
        }
        array[0] = first;
        array[length - 1] = last;

        return array;
    }

}
