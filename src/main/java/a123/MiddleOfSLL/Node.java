package a123.MiddleOfSLL;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

public class Node {
    Node next;
    int value;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return  ""+value;
    }

    public static void print (Node head){

        Node current =head;
        System.out.println("SLL:");
        while (current!=null){
            System.out.print(current.value+ "->");
            current=current.next;
        }
        System.out.println("null");



    }
}
