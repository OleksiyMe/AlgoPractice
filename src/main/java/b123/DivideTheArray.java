package b123;

import java.util.Arrays;
import java.util.Collections;

public class DivideTheArray {
    public static void main(String[] args) {

        Integer[] arr = {3,7,5,6,2};

        System.out.println(Arrays.toString(arr));
        System.out.println("the index afrer wich we divide is " + divide(arr) +
                "\nthe first number for the second array is " + arr[divide(arr)+1]);


    }

    private static int divide(Integer[] arr) {
        int leftSum = 0, rightSum = 0;
      //  Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr, (a,b)->a>=b?-1:1);
        System.out.println(Arrays.toString(arr));
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            rightSum += arr[j];
            if (leftSum > rightSum) return j-1;
            leftSum += arr[i];
        }
        return -1;

    }
}
