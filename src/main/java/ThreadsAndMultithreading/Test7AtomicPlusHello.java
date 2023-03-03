package ThreadsAndMultithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Test7AtomicPlusHello {
    AtomicBoolean oddTurn;
    AtomicInteger counter;
    final int counterMax;
    PrintEven printEven;
    PrintOdd printOdd;
    PutHello putHello;

    public Test7AtomicPlusHello( int counterMax) {
        this.oddTurn = new AtomicBoolean(true);
        this.counter = new AtomicInteger(1);
        this.counterMax = counterMax;
        this.printEven = new PrintEven();
        this.printOdd = new PrintOdd();
        this.putHello = new PutHello();
        new Thread(()->this.printOdd.printOdd()).start();
        new Thread(printEven::printEven).start();
        new Thread(putHello::putHello).start();

    }

    class PutHello {
        synchronized void putHello() {
            while (counter.get() < counterMax) {
                while (counter.get() % 5 == 0) {

                    System.out.println("Hello "+counter.get()+"       <- " + Thread.currentThread().getId());
                    try {
                        wait(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }

    class PrintOdd {
        synchronized void printOdd() {
            while (counter.get() <= counterMax) {
                while (oddTurn.get()) {

                    System.out.println(counter.getAndIncrement() + " <--Printed by " + Thread.currentThread().getId());

                    oddTurn.set(false);
                    try {
                        wait(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    class PrintEven {
        synchronized void printEven() {
            while (counter.get() <= counterMax) {
                while (!oddTurn.get()) {

                    System.out.println(counter.getAndIncrement() + " <--Printed by " + Thread.currentThread().getId());

                    oddTurn.set(true);
                    try {
                        wait(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Test7AtomicPlusHello print = new Test7AtomicPlusHello(40);


    }
}
