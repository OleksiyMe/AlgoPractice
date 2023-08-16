package ThreadsAndMultithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Test15 {

 //   Semaphore semOdd, semEven;
    int counter, counterMax;

    public Test15(int counterMax) {
 //       this.semOdd = new Semaphore(1);
 //       this.semEven = new Semaphore(0);
        this.counterMax = counterMax;
    }

    synchronized void printOdd() {
        while (counter < counterMax) {
            while (counter % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if (counter >= counterMax) return;
            System.out.println(++counter + " Printed by: " + Thread.currentThread().getName());
            notify();
        }
    }

    synchronized void printEven() {
        while (counter < counterMax) {
            while (counter % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if (counter >= counterMax) return;
            System.out.println(++counter + " Printed by: " + Thread.currentThread().getName());
            notifyAll();

        }
    }

    public static void main(String[] args) throws InterruptedException {

        Test15 obj = new Test15(200);
        ExecutorService exec= Executors.newFixedThreadPool(3);
        for (int i = 0; i < 4; i++) {
            if (i%2==0)          exec.execute(obj::printEven);
            else exec.execute(obj::printOdd);
        }
        exec.shutdown();
        exec.awaitTermination(2, TimeUnit.SECONDS);
        exec.shutdownNow();
    }


}
