package ThreadsAndMultithreading.Counter;

public class DriverClass  {
    public static void main (String[] args) throws InterruptedException{

        MyCounterRunnable r =new MyCounterRunnable();

        Thread t1=new Thread(r),
                t2=new Thread(r),
                t3=new Thread(r);

        t1.start();
        t2.start();
        t3.start();
        t3.join();
        t2.join();

        System.out.println(r.getCounter());



    }
}
