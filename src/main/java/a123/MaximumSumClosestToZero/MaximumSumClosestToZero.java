package a123.MaximumSumClosestToZero;

public class MaximumSumClosestToZero {

    public static void main(String[] args) {

        Integer[] arr = new Integer[]{ -37, -18, 4};
        System.out.println(maxSumClosestToZero(arr));

    }

    private static Integer maxSumClosestToZero(Integer[] arr) {

        Integer min = Integer.MAX_VALUE, index1, index2;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if(i==j)continue;
                int currentSum = arr[i] + arr[j];
                if (Math.abs(currentSum) < Math.abs(min)) {
                    min = currentSum;
                    index1 = i;
                    index2 = j;
                }
            }
        }
        return min;
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