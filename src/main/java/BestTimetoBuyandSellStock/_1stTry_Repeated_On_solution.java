package BestTimetoBuyandSellStock;

import java.util.Arrays;

public class _1stTry_Repeated_On_solution {
    public static void main(String[] args) {

        int[] prices = {2, 1, 2, 1, 0, 1, 2};
        System.out.println("Here is our prices by days\n" + Arrays.toString(prices));
        System.out.println("Maximum profit is " + maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE, bestDeal = 0;

        for (int i = 0; i < prices.length; i++) {

            minPrice=Integer.min(minPrice,prices[i]);

            bestDeal=Integer.max(bestDeal,prices[i]-minPrice);
        }
       return bestDeal;

    }
}
