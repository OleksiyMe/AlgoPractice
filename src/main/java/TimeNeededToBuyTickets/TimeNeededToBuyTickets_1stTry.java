package TimeNeededToBuyTickets;

public class TimeNeededToBuyTickets_1stTry {

    public static void main(String[] args) {

        int[] tickets = {2,3,2};   //queue of people And their demand for tickets
        int k = 2; // index of person for which we will find time taken to buy tickets

        System.out.println("It takes: " + timeRequiredToBuy(tickets, k) + " seconds.");

    }

    private static int timeRequiredToBuy(int[] tickets, int k) {
        int result = 0, length=tickets.length;

        for (int i = 0; tickets[k] > 0; i++) {
            if (i == length) i = 0;
            if (tickets[i] > 0) {
                tickets[i] = tickets[i] - 1;
                result++;
            }
        }
        return result;
    }

}
