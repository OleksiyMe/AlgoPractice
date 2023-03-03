package ThreadsAndMultithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test6 {

    volatile int counter, counterMax;

    public Test6(int counterMax) {
        this.counterMax = counterMax;
        counter=5;
    }

    synchronized void printSequence() {

        for (; counter < counterMax; counter++) {
            notifyAll();
            System.out.println(counter + " threadID " + Thread.currentThread().getId());

            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    synchronized void putHelloAfterEach5() {

        while (counter < counterMax) {
            //notifyAll();
            if (counter % 5 == 0) {
                System.out.println("Hello!!! <-- threadID " + Thread.currentThread().getId());
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }


//    synchronized void oechestrator(){
//        while (counter<counterMax){
//            notifyAll();
//            try {
//                Thread.sleep(20);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }


    public static void main(String[] args) {

        Test6 games = new Test6(25);

        Thread t1 = new Thread(() -> games.printSequence());
        Thread t2 = new Thread(() -> games.printSequence());
        Thread t3 = new Thread(() -> games.printSequence());
        Thread t4 = new Thread(() -> games.putHelloAfterEach5());
        //    Thread t4 = new Thread(() -> games.oechestrator());

        t3.start();
        t1.start();
        t2.start();
        t4.start();

        // t4.start();

        //  Test monitor=new Test();
    }
}
