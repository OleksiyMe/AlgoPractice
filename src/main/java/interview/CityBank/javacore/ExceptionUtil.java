package interview.CityBank.javacore;

public class ExceptionUtil {

    public static void main(String[] args) {
        ClassNotFoundException e1;
        NoClassDefFoundError e2;
        Exception a;
        Error b = new Error("sss");
        Throwable c;
        throw b;

//        String result = getText();
//        System.out.println(result);
    }


    public static String getText() {
        try {
            return doSth();
        } catch (Exception e) {
            System.out.println("Exception happened!");
            return "exception";    //will not be returned
        } finally {
            return "final value";   //this return will override previous
        }

    }


    private static String doSth() throws Exception {
        throw new Exception();
    }

    private static String doSth2() throws RuntimeException {
        throw new RuntimeException("sss");
    }

    private static void throwError() throws Error {
        throw new Error("zDvsd");
    }

    private static void throwThrowable() throws Throwable {
        throw new Throwable();
    }


}
