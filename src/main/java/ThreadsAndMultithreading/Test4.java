package ThreadsAndMultithreading;

public class Test4 {
    public static void main(String[] args) {

        class Odd extends Thread {

            @Override
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                }
                for (int i = 1; i <= 6; i += 2) {
                    System.out.println(i);
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
        class Even extends Thread {

            @Override
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                }
                for (int i = 2; i <= 6; i += 2) {
                    System.out.println(i);
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }

        Odd odd = new Odd();
        Even even = new Even();

        odd.start();
        even.start();
        for (int i = 0; i < 5; i++) {
            odd.interrupt();
            even.interrupt();
        }
    }
}
