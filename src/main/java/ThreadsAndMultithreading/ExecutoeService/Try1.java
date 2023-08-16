package ThreadsAndMultithreading.ExecutoeService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Try1 {

    public static void main(String[] args) {


        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i=0; i < 5; i++) {
            Future future = executor.submit(() -> {
                while (true) {
                    System.out.println("Running...");
                    Thread.sleep(Long.MAX_VALUE);
                }
            });

            try {
                future.get(1, TimeUnit.SECONDS);
            } catch (Exception e) {
                if (!future.isDone()) {
                    System.out.println("Oops: " + e.getClass().getSimpleName());
                    future.cancel(true);
                }
            }
        }
    }
}
