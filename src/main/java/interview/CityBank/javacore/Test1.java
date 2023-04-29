package interview.CityBank.javacore;

public class Test1 {

    public static int test(int i) {
        try {
            if (i == 1)
                throw new Exception();
            return 0;
        } catch (Exception e) {
            return 1;
        } finally {
            return 2;     //we always will get 2 as a return value
        }
    }

    String test() {
        try {
            return "1";
        } finally {
            return "2";    //always returns 2
        }
    }


    public static void main(String[] args) {
        System.out.println(test(0));
        System.out.println(test(1));
    }
}