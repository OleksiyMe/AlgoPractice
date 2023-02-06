package a123;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        int[] candies = new int[]{2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(
                Arrays.toString(optimizedKidsWithCandies(candies, extraCandies))
        );
    }

    public static boolean[] kidsWithCandies(int[] candies, int extraCandies) {

        int length = candies.length;
        boolean[] result = new boolean[length];
        for (int i = 0; i < length; i++) {
            int tmpMax = candies[i] + extraCandies;
            boolean isTrueMax = true;
                for (int j = 0; j < length; j++) {
                    if (i == j) continue;
                    isTrueMax &= tmpMax >= candies[j];
                }
            result[i] = isTrueMax;
        }
        return result;
    }

    public static boolean[] optimizedKidsWithCandies(int[] candies, int extraCandies) {

        int max = Integer.MIN_VALUE, length = candies.length;
        boolean[] result = new boolean[length];

        for (int candy : candies) {
            max = Math.max(max, candy);
        }
        int threshold = max - extraCandies;
        for (int i = 0; i < length; i++) {
            result[i] = candies[i] >= threshold;
        }
        return result;
    }

    public static boolean[] optimized1KidsWithCandies(int[] candies, int extraCandies) {

        int[] copyOfCandies = candies.clone();
        Arrays.sort(copyOfCandies);
        int length = candies.length, max = copyOfCandies[length - 1];
        boolean[] result = new boolean[length];

        for (int i = 0; i < length; i++) {
            result[i] = candies[i] >= max - extraCandies;
        }
        return result;
    }

}