package PlayWithFunctionalInterfaces;

import java.util.function.Predicate;

public class TestPredicate {
    public static void main(String[] args) {

        Predicate<String> areYouAPig=(s)->s.toLowerCase().equals("pig");

        System.out.println("are u a Pig? "+areYouAPig.test("Pig"));
    }
}
