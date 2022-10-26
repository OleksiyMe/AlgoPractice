package TimeNeededToBuyTickets;

public class TimeNeededToBuyTickets_Queue_FastSolutionSumeyseWrongAnswer {

    public static void main(String[] args) {

        int[] tickets = {5,1,1,1};   //queue of people And their demand for tickets
        int k = 0; // index of person for which we will find time taken to buy tickets

        System.out.println("It takes: " + timeRequiredToBuy(tickets, k) + " seconds.");

    }

    private static int timeRequiredToBuy(int[] tickets, int k) {
        int result = 0;
        for (int i = 0; i < tickets.length; i++) {

            if (tickets[i] < tickets[k]) {
                result += tickets[k];
            } else {
                if (i <= k) result += tickets[k];
                else result += tickets[k] - 1;
            }
        }
        return result;
    }
}
