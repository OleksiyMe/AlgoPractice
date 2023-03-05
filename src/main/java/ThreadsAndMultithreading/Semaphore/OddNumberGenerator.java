package ThreadsAndMultithreading.Semaphore;

public class OddNumberGenerator implements Runnable {

    private SemaphoreHelper semaphoreHelper;
    private int totalNumberInSequence;

    public OddNumberGenerator(SemaphoreHelper semaphoreHelper, int totalNumberInSequence) {
        this.semaphoreHelper = semaphoreHelper;
        this.totalNumberInSequence = totalNumberInSequence;
    }

    @Override
    public void run() {
        for (int i = 1; i <= totalNumberInSequence; i += 2) {
            semaphoreHelper.printOddNumber(i);


        }


    }
}
