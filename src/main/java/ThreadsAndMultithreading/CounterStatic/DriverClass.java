package ThreadsAndMultithreading.CounterStatic;

public class DriverClass  {
    public static void main (String[] args) throws InterruptedException{

        MyCounterRunnable r1 =new MyCounterRunnable();
        MyCounterRunnable r2 =new MyCounterRunnable();

        Thread t1=new Thread(r1),
                t2=new Thread(r2),
                t3=new Thread(r1);

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t3.join();
        t2.join();

        System.out.println(MyCounterRunnable.getCounter());



    }
}
