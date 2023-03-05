package ThreadsAndMultithreading.CounterStatic;

public class MyCounterRunnable implements Runnable {

    private static int counter;

    @Override
    public void run() {
        for (int i = 0; i < 20000; i++) {
//            synchronized (this) {
//                counter++;
//            }
            extracted();

        }
    }

    //Lock will be applied on Class level . java.lang.Class
    private  static void extracted() {

        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);
        synchronized (MyCounterRunnable.class) {
            counter++;
        }
    }

    public static int getCounter() {
        return counter;
    }


}
