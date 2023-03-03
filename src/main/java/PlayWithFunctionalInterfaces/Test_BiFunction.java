package PlayWithFunctionalInterfaces;

import java.util.function.BiFunction;

public class Test_BiFunction {
    public static void main(String[] args) {

        BiFunction<String,String,String> saySomethingToMe=(a,b)->
                new StringBuilder().append(a).append(", I want to say ").append(b).append(" to you!").toString();

        System.out.println(saySomethingToMe.apply("Oleksiy", "Hiiiiii!!!!"));

    }
}
