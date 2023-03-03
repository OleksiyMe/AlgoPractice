package PlayWithFunctionalInterfaces;

import java.util.function.Function;

public class TestFunction {

    public static void main(String[] args) {

        Function<Double,String> sqrt=d->""+Math.sqrt(d);

        System.out.println(sqrt.apply(2.0));
    }
}
