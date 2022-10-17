package PalindromeLinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class PalindromeLL_SecondTry {
    public static void main(String[] args) {

        SLL<Integer> mySLL = new SLL<>();
        mySLL.add(1);
        mySLL.add(2);
        mySLL.add(2);
        mySLL.add(1);
        System.out.println(mySLL);


        System.out.println(isItAPalindrome(mySLL.head));

    }

    private static <T> boolean isItAPalindrome(Node<T> head) {
        LinkedList<T> stack = new LinkedList<>();
        Node<T> current = head;
        while (current != null) {
            stack.push(current.value);
            current = current.next;
        }
        current = head;
        while (current != null) {
            if (stack.pop() != current.value) return false;
            current = current.next;
        }

        return true;
    }


}
