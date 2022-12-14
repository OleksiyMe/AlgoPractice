package DealingWithArrayElements;

import java.util.Arrays;

public class _Sumeyse {

    public static void main(String[] args) {

        int[] array = {2, 3, 4, 5, 6};

        System.out.println("Input " + Arrays.toString(array));
        System.out.println("Output " + Arrays.toString(dealWithIt(array)));

    }

    private static int[] dealWithIt(int[] ints) {

        if (ints == null) return null;
        int n = ints.length;
        if (n == 1) return ints;
        int[] result = new int[n];
        result[0] = ints[0] * ints[1];
        result[n - 1] = ints[n - 2] * ints[n - 1];
        for (int i = 1; i < n - 1; i++) {
            result[i] = ints[i - 1] * ints[i + 1];
        }
        return result;
    }

}
