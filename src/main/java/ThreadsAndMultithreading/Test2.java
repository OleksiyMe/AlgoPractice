package ThreadsAndMultithreading;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {

        Thread a= new Thread(()->{
            for (int i=0;i<64;i++){
                System.out.println(i+" Thread1");

            }
        });
        a.run();
        System.out.println(a.getState());
        new Thread(()->{

            for (int i=0;i<64;i++){
                System.out.println("Thread2");
            }
        }).run();




    }


}
