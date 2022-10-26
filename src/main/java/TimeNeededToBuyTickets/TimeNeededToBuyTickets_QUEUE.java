package TimeNeededToBuyTickets;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.stream.Collectors;

public class TimeNeededToBuyTickets_QUEUE {

    public static void main(String[] args) {

        int[] tickets = {2,3,2};   //queue of people And their demand for tickets
        int k = 2; // index of person for which we will find time taken to buy tickets

        System.out.println("It takes: " + timeRequiredToBuy(tickets, k) + " seconds.");

    }

    private static int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> ticketQueue = Arrays.stream(tickets).boxed()
                .collect(Collectors.toCollection(ArrayDeque::new));


        int totalTime = 0;
        while (!ticketQueue.isEmpty()) {

            int leftTicketCount = ticketQueue.poll()-1;
            totalTime++;

            if (leftTicketCount == 0){
                if (k == 0){
                    return totalTime;
                }
                else if (k > 0){
                    k--;
                }
            }
            else {
                ticketQueue.add(leftTicketCount);
                if (k > 0){
                    k--;
                }
                else if (k == 0){
                    k = ticketQueue.size() - 1;
                }
            }
        }

        return -1;

    }

}
