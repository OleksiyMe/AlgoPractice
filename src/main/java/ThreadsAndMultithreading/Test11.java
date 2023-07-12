package ThreadsAndMultithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Test11 {

    int counter, maxCounter;
    //boolean currentIsOdd;

    public Test11(int maxCounter) {
        this.maxCounter = maxCounter;
        //this.currentIsOdd=false;
        this.counter = 0;

    }

    synchronized void printNext(boolean nextIsOdd) {
        if ((counter > maxCounter)) return;
        while (true) {

            //print odd
            if (nextIsOdd) {
                if (counter % 2 != 0) {
                    System.out.println(counter++ + " "+Thread.currentThread().getId());
                }
                notifyAll();

            }
            //print even
            if (!nextIsOdd) {
                if (counter % 2 == 0) {
                    System.out.println(counter++ + " "+Thread.currentThread().getId());
                }
                notifyAll();
            }
            try {
                wait(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if ((counter > maxCounter)) break;

        }
    }

    public static void main(String[] args) {

        Test11 instance = new Test11(5000);

        ExecutorService exec= Executors.newFixedThreadPool(5);
        boolean nextIsOdd=true;

        for (int i = 0; i < 1000; i++) {
            final boolean t=nextIsOdd;
            exec.execute(()->instance.printNext(t));
            nextIsOdd=!nextIsOdd;
        }
        int numberOfThreads=((ThreadPoolExecutor)exec).getPoolSize();
        exec.shutdown();
        while (!exec.isTerminated()){}
        System.out.println("Pool size was " + numberOfThreads);
    }


}
