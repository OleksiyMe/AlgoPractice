package PlayWithFunctionalInterfaces;

import java.util.function.UnaryOperator;

public class TestUnaryOperator {
    public static void main(String[] args) {

        UnaryOperator<String>  reverseMe=s-> new StringBuilder(s).reverse().toString();

        System.out.println(reverseMe.apply("abcde"));


    }
}
