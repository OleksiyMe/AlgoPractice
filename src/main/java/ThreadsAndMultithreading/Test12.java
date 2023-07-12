package ThreadsAndMultithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Test12 {

    int counter, maxCounter;
    //boolean currentIsOdd;

    public Test12(int maxCounter) {
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

        Test12 instance = new Test12(5000);
        Test12 instance1 = new Test12(5000);

        new Thread(()->instance1.printNext(true)).start();
        new Thread(()->instance1.printNext(false)).start();
        //new Thread(()->instance.printNext(false)).start();
        new Thread(()->instance1.printNext(true)).start();
        new Thread(()->instance1.printNext(false)).start();

    }


}
