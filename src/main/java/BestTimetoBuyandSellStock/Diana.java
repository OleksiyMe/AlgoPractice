package BestTimetoBuyandSellStock;

import java.util.Arrays;

public class Diana {
    public static void main(String[] args) {

        int[] prices = {2, 1, 2, 1, 0, 1, 2};
        System.out.println("Here is our prices by days\n" + Arrays.toString(prices));
        System.out.println("Maximum profit is " + maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {

        if(prices.length<=1) return 0;

        int min=Integer.MAX_VALUE;
        int result=0;
        for (int i = 0; i < prices.length; i++) {
            result= Math.max(result, prices[i]-min);
            min=Math.min(min,prices[i]);
        }
    return result;
    }
}
