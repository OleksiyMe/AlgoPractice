package ThreadsAndMultithreading.Semaphore;

public class OddEvenTestApp {
    public static void main(String[] args) {
        SemaphoreHelper semaphoreHelper = new SemaphoreHelper();
        int TOTAL_NUMBER_IN_SEQUENCE = 20;

        OddNumberGenerator oddNumberGenerator =
                new OddNumberGenerator(semaphoreHelper, TOTAL_NUMBER_IN_SEQUENCE);
        EvenNumberGenerator evenNumberGenerator =
                new EvenNumberGenerator(semaphoreHelper, TOTAL_NUMBER_IN_SEQUENCE);

        Thread t1 = new Thread(oddNumberGenerator, "Thread 1 for odd numbers");
        Thread t2 = new Thread(evenNumberGenerator, "Thread 2 for even numbers");
//        Thread t3 = new Thread(oddNumberGenerator, "Thread 3 for odd numbers");
//        Thread t4 = new Thread(evenNumberGenerator, "Thread 4 for even numbers");

        t1.start();
        t2.start();
//        t3.start();
//        t4.start();

    }
}
