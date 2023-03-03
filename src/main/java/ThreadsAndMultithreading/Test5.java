package ThreadsAndMultithreading;

public class Test5 {

    int count;

    public Test5(int count) {
        this.count = count;
    }

    public synchronized void odd() {
        for (int i = 1; i <= count; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                notify();
            } else
                try {
                    wait();
                } catch (InterruptedException e) {
                }
        }
    }

    public synchronized void even() {
        for (int i = 1; i <= count; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                notify();
            } else
                try {
                    wait();
                } catch (InterruptedException e) {
                }

        }
    }

    public static void main(String[] args) {

        Test5 print = new Test5(10);

        Thread thread1 = new Thread(print::even),
                thread2 = new Thread(print::odd);

        thread1.start();
        thread2.start();

    }


}
