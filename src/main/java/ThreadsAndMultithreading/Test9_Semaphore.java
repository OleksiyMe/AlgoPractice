package ThreadsAndMultithreading;

import java.util.concurrent.Semaphore;

public class Test9_Semaphore {
    private final int counterMax;
    private final Semaphore semaphoreEven, semaphoreOdd;

    public Test9_Semaphore(int counterMax) {
        this.counterMax = counterMax;
        this.semaphoreOdd = new Semaphore(1);
        this.semaphoreEven = new Semaphore(0);
        new Thread(this::printOdd).start();
        new Thread(this::printEven).start();

    }

    public void printOdd() {
        for (int i = 1; i < counterMax; i += 2) {
            try {
                semaphoreOdd.acquire();
                System.out.println(i + "   printed by " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                semaphoreEven.release();
            }
        }
    }

    public void printEven() {
        for (int i = 2; i < counterMax; i += 2) {
            try {
                semaphoreEven.acquire();
                System.out.println(i + "   printed by " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                semaphoreOdd.release();
            }
        }
    }

    public static void main(String[] args) {
        new Test9_Semaphore(100);
    }
}