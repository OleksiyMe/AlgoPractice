package a123.MaximumSumClosestToZero;

import java.util.Arrays;

public class MaximumSumClosestToZero1 {

    public static void main(String[] args) {

        Integer[] arr = new Integer[]{ -37, -18, 4};
        System.out.println(maxSumClosestToZero(arr));

    }

    private static Integer maxSumClosestToZero(Integer[] array) {

        Arrays.sort(array);
        int leftPointer=0;
        int rightPointer=array.length-1;
        int res=Integer.MAX_VALUE;
        while(leftPointer<rightPointer){
            int difference=array[rightPointer]+array[leftPointer];
            if(Math.abs(res)>Math.abs(difference))res=difference;
          //  res=Math.min(res, difference);
            if (difference>0) rightPointer--;
            else if (difference<0)leftPointer++;
            else return 0;
        }
        return res;
    }
}

/*
       Given an integer array of N elements. You need to find the maximum sum of two
        elements such that sum is closest to zero.
       Example 1:

Input:
N = 3
arr[] = {-8 -66 -60}
Output: -68
Explanation: Sum of two elements closest to
zero is -68 using numbers -60 and -8.
Example 2:
Input:
N = 6
arr[] = {-21 -67 -37 -18 4 -65}



Output: -14
Explanation: Sum of two elements closest to
zero is -14 using numbers -18 and 4.
     */