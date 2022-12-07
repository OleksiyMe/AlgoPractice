package BestTimetoBuyandSellStock;

import java.util.Arrays;

public class _1stTry_notsolved {
    public static void main(String[] args) {

        int[] prices = {2,1,2,1,0,1,2};
        System.out.println("Here is our prices by days\n" + Arrays.toString(prices));
        System.out.println("Maximum profit is " + maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        //if (prices.length <= 1) return 0;
        int index1 = 0, index2 = prices.length - 1, sum = prices[index2] - prices[index1];



        return sum;

    }
}
