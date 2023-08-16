package ThreadsAndMultithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test14 {

    static class Print implements Runnable {

        Lock lockOdd, lockEven;
        int counter, counterMax;
        boolean printOnlyEven;

        public Print(Lock lockOdd, Lock lockEven, int counterMax, boolean printOnlyEven) {
            this.lockOdd = lockOdd;
            this.lockEven = lockEven;
            this.counterMax = counterMax;
            this.printOnlyEven= printOnlyEven;
        }

        @Override
        public void run() {
            while (true) {
                if (lockOdd.tryLock()) {
                    if (counter>=counterMax){ lockOdd.unlock(); return;}
                    System.out.println(++counter+" "+Thread.currentThread().getName());
                    if (counter>=counterMax){ lockOdd.unlock(); return;}
                    lockOdd.unlock();
                    continue;
                }

                if (lockEven.tryLock()) {
                    if(!printOnlyEven) continue;
                    if (counter>=counterMax){ lockOdd.unlock(); return;}
                    System.out.println(++counter+" "+Thread.currentThread().getName());
                    if (counter>=counterMax){ lockEven.unlock(); return;}
                    lockEven.unlock();
                    continue;
                }
            }
        }


    }

    public static void main(String[] args) throws InterruptedException {

        Lock lockOdd = new ReentrantLock(), lockEven = new ReentrantLock();
        lockEven.lock();

        Runnable runnableEven = new Print(lockOdd, lockEven, 1000, true),
        runnableOdd=new Print(lockOdd, lockEven, 1000, false);

        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 2; i++) {
            if(i%2==0)            executor.execute(runnableEven);
            else executor.execute(runnableOdd);
        }
        executor.shutdown();
        executor.awaitTermination(1,TimeUnit.SECONDS);
        executor.shutdownNow();

    }

}
