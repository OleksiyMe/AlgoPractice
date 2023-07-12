package ThreadsAndMultithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;

public class Test10_SemaphoreAndExecuterService {
    private final int counterMax;
    private final Semaphore semaphoreEven, semaphoreOdd;

    public Test10_SemaphoreAndExecuterService(int counterMax) {
        this.counterMax = counterMax;
        this.semaphoreOdd = new Semaphore(1);
        this.semaphoreEven = new Semaphore(0);
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
        Test10_SemaphoreAndExecuterService test10=new Test10_SemaphoreAndExecuterService(100);

        ExecutorService executorScaled= Executors.newCachedThreadPool();
        //for (int i=0;i<1;i++) {
            executorScaled.execute(test10::printOdd);
            executorScaled.execute(test10::printEven);


       // }

        int numberOfThreads=((ThreadPoolExecutor)executorScaled).getPoolSize();
        executorScaled.shutdown();
        boolean tt=executorScaled.isTerminated();
        while (!executorScaled.isTerminated()){}
        System.out.println("Number of threads used "+numberOfThreads);



    }
}