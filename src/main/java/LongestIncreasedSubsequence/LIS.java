package LongestIncreasedSubsequence;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;

public class LIS {

    public static void main(String[] args) {

        int[] input = new int[]{3,1,5,0,6,4,9};
        System.out.println(Arrays.toString(lis(input)));
    }

    private static int[] lis(int[] input) {
        int begin = 0, beginMax = 0, end = 0, endMax = 0, size = 0, maxSize = 0;



        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] < input[i + 1]) {
                size++;
                end = i+1;
                //  continue;
            } else {
                if (size > maxSize) {
                    maxSize = size; size=0;
                    beginMax = begin; begin=i;
                    i = begin - 1;
                    endMax = end; end = begin;
                }
                size=0;
                begin++;
                i=begin-1;
            }
        }
        return Arrays.copyOfRange(input, beginMax, endMax+1);
    }


}
