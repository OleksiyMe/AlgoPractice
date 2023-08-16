package Exceptions;

public class FinallyReturn1 {
    int giveMeSomeInt() {
        try {
            System.out.println("I am in try block");
            return 30;
        }
//        catch (Exception umran)
//        {
//            System.out.println("I like ur sea view picture :)");
//        }
        finally {
            System.out.println("I am in finally block");
            return 50;
        }
    }

    public static void main(String[] args) {
        FinallyReturn1 obj = new FinallyReturn1();
        System.out.println(obj.giveMeSomeInt());
    }
}