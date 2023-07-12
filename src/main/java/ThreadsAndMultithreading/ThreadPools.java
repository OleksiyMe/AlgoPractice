package ThreadsAndMultithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPools {




    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        ExecutorService executorFixed = Executors.newFixedThreadPool(10);
        ExecutorService executorScaled= Executors.newCachedThreadPool();
        executor.execute(()-> System.out.println("Hi"));
        for (int i = 0; i < 100; i++) {
            executorScaled.execute(()-> System.out.println(Thread.currentThread().getName()));

        }
        executor.shutdown();

        executorFixed.shutdown();
        while(!executorFixed.isTerminated()){}

        int poolSize=((ThreadPoolExecutor)executorScaled).getPoolSize();
        executorScaled.shutdown();
        while(!executorScaled.isTerminated()){}

        System.out.println(poolSize);



    }
}
