package ThreadsAndMultithreading;

import java.util.concurrent.Semaphore;

public class Test8_Semaphore {

    private volatile int counter;
    private final int counterMax;
    private Semaphore semaphoreOdd, semaphoreEven;

    public Test8_Semaphore(int counterMax) {
        this.counter = 0;
        this.counterMax = counterMax;
        this.semaphoreOdd = new Semaphore(1);
        this.semaphoreEven = new Semaphore(0);
        new Thread(()->printOdd()).start();
        new Thread(()->printOdd()).start();
        new Thread(()->printOdd()).start();
        new Thread(()->printEven()).start();
        new Thread(()->printOdd()).start();
        new Thread(()->printEven()).start();
        new Thread(()->printOdd()).start();
        new Thread(()->printEven()).start();
        new Thread(()->printOdd()).start();
        new Thread(()->printEven()).start();
        new Thread(()->printOdd()).start();
        new Thread(()->printOdd()).start();
        new Thread(()->printOdd()).start();
        new Thread(()->printOdd()).start();
        new Thread(()->printOdd()).start();
        new Thread(()->printOdd()).start();
    }

    public void printOdd() {
        while (true) {
            try {
                semaphoreOdd.acquire();
                if (counter>counterMax) return;
                System.out.println(counter++ +"   printed by "+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                semaphoreEven.release();
            }
        }
    }

    public void printEven() {
        while (true) {
            try {
                semaphoreEven.acquire();
                if (counter>counterMax) return;
                System.out.println(counter++ +"   printed by "+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                semaphoreOdd.release();
            }
        }
    }

    public static void main(String[] args) {
        new Test8_Semaphore(100);
    }
}
