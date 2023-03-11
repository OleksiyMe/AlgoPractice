package ThreadsAndMultithreading;

import java.util.concurrent.Semaphore;

public class Test8_Semaphore_refactored {

    private volatile int counter;
    private final int counterMax;
    private Semaphore semaphoreOdd, semaphoreEven;

    public Test8_Semaphore_refactored(int counterMax) {
        this.counter = 0;
        this.counterMax = counterMax;
        this.semaphoreOdd = new Semaphore(1);
        this.semaphoreEven = new Semaphore(0);
        new Thread(() -> printOdd()).start();
        new Thread(() -> printOdd()).start();
        new Thread(() -> printOdd()).start();
        new Thread(() -> printEven()).start();
        new Thread(() -> printOdd()).start();
        new Thread(() -> printEven()).start();
    }

    public void printOdd() {
        doThisPrint(semaphoreOdd, semaphoreEven);
    }

    public void printEven() {
        doThisPrint(semaphoreEven, semaphoreOdd);
    }

    private void doThisPrint(Semaphore activeSemaphore, Semaphore blockedSemaphore) {
        while (true) {
            try {
                activeSemaphore.acquire();
                if (counter > counterMax) return;
                System.out.println(counter++ + "   printed by " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                blockedSemaphore.release();
            }
        }
    }

    public static void main(String[] args) {
        new Test8_Semaphore_refactored(100);
    }
}
