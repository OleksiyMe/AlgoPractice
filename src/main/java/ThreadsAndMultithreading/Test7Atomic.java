package ThreadsAndMultithreading;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Test7Atomic {
    AtomicBoolean oddTurn;
     AtomicInteger counter;
    final int counterMax;

    public Test7Atomic(int counterMax) {
        this.counterMax = counterMax;
        this.counter = new AtomicInteger(1);
        this.oddTurn = new AtomicBoolean(true);
        new Thread(this::printOdd).start();
        new Thread(this::printEven).start();

    }

    void printOdd() {
        while (counter.get() <= counterMax) {
            while (oddTurn.get()) {

                System.out.println(counter + " <--Printed by " + Thread.currentThread().getId());
                counter.getAndIncrement();
                oddTurn.set(false);
            }
        }
    }

    void printEven() {
        while (counter.get() <= counterMax) {
            while (!oddTurn.get()) {

                System.out.println(counter + " <--Printed by " + Thread.currentThread().getId());
                counter.getAndIncrement();
                oddTurn.set(true);
            }
        }
    }

    public static void main(String[] args) {
        Test7Atomic print = new Test7Atomic(40);
    }
}
