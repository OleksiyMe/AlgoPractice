package a12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class Multithread {

   // volatile List<String> list=new ArrayList<>();
    public Multithread() {


    }



    static String doSomething() {

        return Thread.currentThread().getName();
    }

    public static void main(String[] args) throws InterruptedException {
        Multithread test = new Multithread();

        ArrayList<String> list = new ArrayList<>();


        Thread t1 = new Thread(() -> {
            list.add(doSomething());

        });


        Thread t2 = new Thread(() -> {
            list.add(doSomething());

        });

        t1.start();
        t2.start();
        System.gc();


        t1.join();
        t2.join();

        System.out.println(list.size());
    }


//    public static String doSomt(String operation){
//
//        Map<String, Consumer<Integer>> map=new HashMap<>();
//
//        map.put("update", ()->{
//            doSth1();
//                return 1;
//        });
//
//        map.put("delete", ()->{
//            doSth2();
//            return 1;
//        });
//        .....
//
//
//
//
//
//    }


}
