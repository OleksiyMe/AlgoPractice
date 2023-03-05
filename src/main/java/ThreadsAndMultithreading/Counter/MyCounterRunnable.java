package ThreadsAndMultithreading.Counter;

public class MyCounterRunnable implements Runnable {

    private int counter;

    @Override
    public void run() {
        for (int i = 0; i < 20000; i++) {
//            synchronized (this) {
//                counter++;
//            }
            extracted();

        }
    }

    private  void extracted() {

        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);
        synchronized (this) {
            counter++;
        }
    }

    public int getCounter() {
        return counter;
    }


}
