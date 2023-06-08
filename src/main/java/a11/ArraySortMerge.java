package a11;

import java.util.Arrays;

public class ArraySortMerge {
    public static void main(String[] args) {

        int[] input = {1, -2, -5, 10, -9, 1};
        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(sort(input)));
    }

    private static int[] sort(int[] input) {

        int length=input.length,middle = (length ) / 2;
        if (length==1) return input;
        if (length==2) {
            if (input[0]>input[1]){int tmp=input[0];input[0]=input[1];input[1]=tmp; return input;}
        }
        int[] left = sort(Arrays.copyOfRange(input, 0, middle));
        int[] right = sort(Arrays.copyOfRange(input, middle, length));

        return merge(left,right);
    }


    static int[] merge(int[] a, int[] b) {
        int aLength = a.length, bLength = b.length;
        int[] result = new int[aLength + bLength];

        for (int i = 0, aIndex = 0, bIndex = 0; i < result.length; i++) {

            if (bIndex == bLength) {
                result[i] = a[aIndex];
                aIndex++;
                continue;
            }
            if (aIndex == aLength) {
                result[i] = b[bIndex];
                bIndex++;
                continue;
            }
            if (a[aIndex] > b[bIndex]) {
                result[i] = b[bIndex];
                bIndex++;
            } else {
                result[i] = a[aIndex];
                aIndex++;
            }

        }
        return result;
    }

}
