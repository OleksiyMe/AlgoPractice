package PalindromeLinkedList;

import java.util.LinkedList;

public class PalindromeLL_FirstTry {
    public static void main(String[] args) {

        SLL<Character> mySLL = new SLL<>();
        mySLL.add('a');
        mySLL.add('b');
        mySLL.add('b');
        mySLL.add('a');
        System.out.println(mySLL);


        System.out.println(isItAPalindrome(mySLL.head));

    }

    private static <T>boolean isItAPalindrome(Node<T> head) {
        LinkedList<T> stack = new LinkedList<>();
        LinkedList<T> list = new LinkedList<>();
        Node<T> current=head;
        while (current!=null){
            stack.push(current.value);
            list.add(current.value);
            current=current.next;
        }

            return list.equals(stack);
    }


}
