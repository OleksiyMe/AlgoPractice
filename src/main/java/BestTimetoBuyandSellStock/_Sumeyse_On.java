package BestTimetoBuyandSellStock;

import java.util.Arrays;

public class _Sumeyse_On {
    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        System.out.println("Here is our prices by days\n" + Arrays.toString(prices));
        System.out.println("Maximum profit is " + maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        //initialize the minimum price to buy
        int minBuy = prices[0];
        //initialize the maximum profit
        int profit = 0;
        //Traverse all elements with a for loop
        for (int i = 0; i < prices.length; i++) {
            //Get the minimum price to buy
            minBuy = Math.min(minBuy, prices[i]);
            //get the maximum profit...
            profit = Math.max(profit, prices[i] - minBuy);
        }
        return profit;

    }
}
