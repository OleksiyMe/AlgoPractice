package BestTimetoBuyandSellStock;

import java.util.Arrays;

public class _Sumeyse_OnSquare {
    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        System.out.println("Here is our prices by days\n" + Arrays.toString(prices));
        System.out.println("Maximum profit is " + maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int diff = prices[j] - prices[i];
                if (diff > max) max = diff;

            }
        }
        return max;
    }
}
