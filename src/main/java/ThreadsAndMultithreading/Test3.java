package ThreadsAndMultithreading;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {

        class MyThread extends Thread {


            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("thread " + MyThread.currentThread().getId() + " prints " + i);


                }
            }
        }

        MyThread a = new MyThread();
        MyThread b = new MyThread();
        a.start();
        b.start();

    }


}
