package Maryna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class RemoveValuesGreaterThan100 {
   // Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100.

    //Let us create static fields Random and List
    static Random random=new Random();
    static List<Integer> input=new ArrayList<>();
    //we will prepare our list of Integers (20 random elements in [0-200] range) in this static block
    static{
        for (int i = 0; i < 20; i++) {
            input.add(random.nextInt(201));
        }
    }

    public static void main(String[] args) {
        System.out.println("We had\n"+input);
        System.out.println("We get\n"+killThemAllThatGreaterThan100(input));
    }

    public static List<Integer> killThemAllThatGreaterThan100(List<Integer> input) {
        //because iterator returned by ArrayList and LinkedList is fail-fast we need to use special
        //method removeIf() to remove elements matching some condition(s)
        //another approach - is to use explicit Iterator, and it's methods hasNext(), next(), remove()
        //I show this approach in killThemAllThatGreaterThan100_2 custom method
        input.removeIf(element->element>100);
        return input;
    }

    public static List<Integer> killThemAllThatGreaterThan100_2(List<Integer> input) {

        Iterator<Integer> iterator=input.iterator();
        while(iterator.hasNext()){
            if (iterator.next()>100) iterator.remove();
        }
        return input;
    }
}
