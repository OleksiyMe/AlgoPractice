package ThreadsAndMultithreading.Semaphore;

public class EvenNumberGenerator implements Runnable {

    private SemaphoreHelper semaphoreHelper;
    private int totalNumberInSequence;

    public EvenNumberGenerator(SemaphoreHelper semaphoreHelper, int totalNumberInSequence) {
        this.semaphoreHelper = semaphoreHelper;
        this.totalNumberInSequence = totalNumberInSequence;
    }

    @Override
    public void run() {
        for (int i = 2; i <= totalNumberInSequence; i += 2) {
            semaphoreHelper.printEvenNumber(i);
        }
    }
}
