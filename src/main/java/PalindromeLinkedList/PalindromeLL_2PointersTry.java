package PalindromeLinkedList;

import java.util.ArrayDeque;

public class PalindromeLL_2PointersTry {
    public static void main(String[] args) {
        SLL<Integer> mySLL = new SLL<>();
        mySLL.add(8);
        mySLL.add(1);
        mySLL.add(2);
        mySLL.add(1);
        mySLL.add(2);
        mySLL.add(1);
        mySLL.add(8);
        System.out.println(mySLL);
        System.out.println(isItAPalindrome(mySLL.head));
    }
    private static <T> boolean isItAPalindrome(Node<T> head) {
        Node<T> slowPointer = head, fastPointer = head;       //initializing 2 pointers

        while (fastPointer!=null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }                    // slowPointer in the middle of SLL (or next to middle if SLL has even elements)

        Node<T> prev = slowPointer;             //initializing vars for SLL reverse
        Node<T> current = slowPointer.next;     //initializing vars for SLL reverse
        Node<T> next = null;                     //initializing vars for SLL reverse
        prev.next = null;                      //breaking the reverse SLL

        while (current != null) {   //reverse the second part of SLL
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
       /* SLL<T> testSLL = new SLL<>(prev);   //testing the result of reverse
        System.out.println(testSLL);*/
        slowPointer = head;    //slowPointer - to the head
        fastPointer=prev;      //fast pointer - to the head of reversed SLL
        while (slowPointer != null && fastPointer!=null) {
            if (slowPointer.value != fastPointer.value) return false;
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }
        return true;
    }
}
