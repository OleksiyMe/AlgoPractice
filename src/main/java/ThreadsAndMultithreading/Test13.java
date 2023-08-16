package ThreadsAndMultithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test13 {

    private int counter, max;

    public Test13(int max) {
        this.max = max;
        counter = 0;
    }

    synchronized void increment(boolean willPrintOdd) {

        while (counter < max) {
            while (counter % 2 != 0 && willPrintOdd || counter % 2 == 0 && !willPrintOdd) {
                try {
                    wait();
                    if (counter >= max) return;
                } catch (Exception e){
                    System.err.println(e.getMessage());
                }
            }
            ++counter;
            System.out.println(Thread.currentThread().getName() + (willPrintOdd?" ODD ":" EVEN ")+
                    "\t\t made counter " + counter);
            notifyAll();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Test13 test13_ = new Test13(2000);
        Runnable runnableOdd = () -> {
            test13_.increment(true);
        };
        Runnable runnableEven = () -> {
            test13_.increment(false);
        };

        System.out.println("Start " + test13_.counter);


        ExecutorService executorService= Executors.newFixedThreadPool(10);

        for (int i = 0; i <1000 ; i++) {
            if (i%2==0) executorService.execute(runnableEven);
            else executorService.execute(runnableOdd);
        }
        executorService.shutdown();

//        Thread t1 = new Thread(runnableOdd);
//        Thread t2 = new Thread(runnableEven);
//        Thread t3 = new Thread(runnableOdd);
//        Thread t4 = new Thread(runnableEven);
//
//
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t1.join();
//        t2.join();
//        t3.join();
//        t4.join();

        System.out.println(test13_.counter);

    }

}
