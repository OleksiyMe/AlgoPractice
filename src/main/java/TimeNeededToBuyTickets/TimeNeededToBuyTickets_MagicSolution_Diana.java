package TimeNeededToBuyTickets;

public class TimeNeededToBuyTickets_MagicSolution_Diana {

    public static void main(String[] args) {

        int[] tickets = {5,1,1,1};   //queue of people And their demand for tickets
        int k = 0; // index of person for which we will find time taken to buy tickets

        System.out.println("It takes: " + timeRequiredToBuy(tickets, k) + " seconds.");

    }

    private static int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;

        for (int i = 0; i < tickets.length; i++) {
            if(i <= k)
                count += Math.min(tickets[i], tickets[k]);
            else count += Math.min(tickets[k] - 1, tickets[i]);
        }

        return count;
    }
}
