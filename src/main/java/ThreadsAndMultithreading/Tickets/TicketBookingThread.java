package ThreadsAndMultithreading.Tickets;

public class TicketBookingThread extends Thread {

    private TicketCounter ticketCounter;
    private String passengerName;
    private int noOfSeatsToBook;

    public TicketBookingThread(TicketCounter ticketCounter, String passengerName, int noOfSeatsToBook) {
        this.ticketCounter = ticketCounter;
        this.passengerName = passengerName;
        this.noOfSeatsToBook = noOfSeatsToBook;
    }

    @Override
    public void run() {
        ticketCounter.bookTicket(passengerName, noOfSeatsToBook);
    }
}
