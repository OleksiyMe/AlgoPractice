package ThreadsAndMultithreading;

public class Test {


    public static void main(String[] args) {


        new Thread( ()-> System.out.println("1, 3, 5")).start();
        new Thread(()-> System.out.println("2, 4, 6")).start();


    }
}
