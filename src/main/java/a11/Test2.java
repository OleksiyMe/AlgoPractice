package a11;

public class Test2 {
    public static void main(String[] args) {
        final int num1 = 10,num2 = 20;
        while(num1<num2){
            System.out.println(num1);
        }
     //   System.out.println(num2);    unreachable statement, compile time error
    }
}
