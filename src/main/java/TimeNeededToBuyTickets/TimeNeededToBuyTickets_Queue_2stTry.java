package TimeNeededToBuyTickets;

import java.util.PriorityQueue;

public class TimeNeededToBuyTickets_Queue_2stTry {

    public static void main(String[] args) {

        int[] tickets = {2,3,2};   //queue of people And their demand for tickets
        int k = 2; // index of person for which we will find time taken to buy tickets

        System.out.println("It takes: " + timeRequiredToBuy(tickets, k) + " seconds.");

    }

    private static int timeRequiredToBuy(int[] tickets, int k) {
        /*int result = 0;
        for (int i = 0; tickets[k] > 0; i++) {
            if (i == tickets.length) i = 0;
            if (tickets[i] > 0) {
                tickets[i] = tickets[i] - 1;
                result++;
            }
        }*/
        return 0;


    }


}
