package a11;

import org.apache.commons.compress.harmony.unpack200.NewAttributeBands;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Test4Multithread {

    Random rnd;
    public Test4Multithread(){
        rnd=new Random();

    }
    String doSomething(){
        return "Thread "+Thread.currentThread().getId()+" says: "+rnd.nextInt(11);

    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Test4Multithread obj=new Test4Multithread();
        Callable<String> task=()->{
            //System.out.println(Thread.currentThread().getName()+" is working");
            System.out.print(".");
            Thread.sleep(10);
            return obj.doSomething();
        };

        ExecutorService executor= Executors.newFixedThreadPool(100);
        List<Callable<String>>tasks=new ArrayList<>();
        List<String> list=new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            tasks.add(task);
        }

        List<Future<String>> resultFuture=executor.invokeAll(tasks) ;
        int threadsUsed=((ThreadPoolExecutor)executor).getPoolSize();
        System.out.println("Threads used: "+threadsUsed);
        executor.shutdown();
     //   executor.awaitTermination(5,TimeUnit.SECONDS);


        for (Future<String> stringFuture : resultFuture) {
            list.add(stringFuture.get());
        }

        System.out.println("\n"+list);
        System.out.println("List size is "+list.size());


    }


}
