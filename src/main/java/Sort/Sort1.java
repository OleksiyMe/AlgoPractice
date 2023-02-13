package Sort;

import java.util.Arrays;

public class Sort1 {
    public static void main(String[] args) {
        String[] input = new String[]{"az", "av", "aa"};
        sort(input);
        System.out.println(Arrays.toString(input));
    }

    private static void sort(String[] input) {

        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i].compareToIgnoreCase(input[i + 1]) > 0) {
                    swap(input, i, i + 1);
                    swap = true;
                }
            }
        }
    }

    private static void swap(String[] input, int x, int y) {
        String tmp = input[x];
        input[x] = input[y];
        input[y] = tmp;
    }
}
