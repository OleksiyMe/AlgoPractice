package PlayWithFunctionalInterfaces;

import java.util.function.Consumer;

public class TestConsumer {

    public static void main(String[] args) {

      Consumer<String>sayHiTo =(p)-> System.out.println("Hi, "+p+"!!");

      sayHiTo.accept("Oleksiy");

    }
}
