package a123;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

class Solution {

    public static void main(String[] args) {
        int[] candies = new int[]{2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(
                Arrays.toString(optimizeKidsWithCandies(candies, extraCandies))
        );
    }

    public static boolean[] kidsWithCandies(int[] candies, int extraCandies) {
        boolean[] result = new boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            int tmpMax = candies[i] + extraCandies;
            boolean isTrueMax = true;
                for (int j = 0; j < candies.length; j++) {
                    if (i == j) continue;
                    isTrueMax &= tmpMax >= candies[j];
                }
            result[i] = isTrueMax;
        }
        return result;
    }

    public static boolean[] optimizeKidsWithCandies(int[] candies, int extraCandies) {
        boolean[] result = new boolean[candies.length];

        int max= Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            max=Math.max(max,candies[i]);
        }
        for (int i = 0; i < candies.length; i++) {
            result[i] = candies[i] >= max - extraCandies;
        }
        return result;
    }

    public static boolean[] optimize1KidsWithCandies(int[] candies, int extraCandies) {
        boolean[] result = new boolean[candies.length];

        int[] copyOfCandies = candies.clone();
        Arrays.sort(copyOfCandies);
        int max=copyOfCandies[candies.length-1];

        for (int i = 0; i < candies.length; i++) {
            result[i] = candies[i] >= max - extraCandies;
        }
        return result;
    }

}