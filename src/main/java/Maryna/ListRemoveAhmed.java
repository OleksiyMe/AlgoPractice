package Maryna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListRemoveAhmed {
//    Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Aaron".....
//    Write a java operation to remove all the names named Ahmed
    public static void main(String[] args) {

        List<String> list =new ArrayList<>(
                Arrays.asList("Ahmed", "Oleg", "Alex", "Ahmed", "Maria")
        );
        System.out.println("We had\n"+list);
        System.out.println("We get\n"+removeAhmed2(list));

    }

    public static List<String> removeAhmed(List<String> list) {
        //because iterator returned by ArrayList and LinkedList is fail-fast we need to use special
        //method removeIf to remove elements matching some conditions
        //another approach - is to use explicit Iterator, and it's methods hasNext(), next(), remove()
        //I show this approach in removeAhmed2 custom method
        list.removeIf(element->element.equals("Ahmed"));
        return list;
    }

    public static List<String> removeAhmed2(List<String> list) {

        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            if (iterator.next().equals("Ahmed")) iterator.remove();
        }
        return list;
    }
}
