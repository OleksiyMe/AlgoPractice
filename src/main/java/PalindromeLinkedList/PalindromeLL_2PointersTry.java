package PalindromeLinkedList;

import java.util.ArrayDeque;

public class PalindromeLL_2PointersTry {
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

        Node<T> slowPointer = head, fastPointer = head,
                current = head,
                prev = head,
                next = head;

        while (fastPointer != null) {
            prev = slowPointer;
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }  // slowPointer in the middle of SLL

        prev=slowPointer;
        current=slowPointer.next;
        next=slowPointer.next.next;

        prev.next=null;

        while (next != null) {   //reverse the second part of SLL

            current.next=prev;


        }


        return true;
    }


}
