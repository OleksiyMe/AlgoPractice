package DeleteNnodesAfterMnodesOfSLL;

import java.util.NoSuchElementException;

public class DeleteNnodesAfterMnodesOfSLL_1try {

    public static void main(String[] args) {

        SLL<Integer> sll = new SLL<>();
        sll.add(new Integer[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13
        });
        sll.print();
        int m = 2, n = 3;
        SLL<Integer> sllResult = new SLL<>(deleteNodes(sll.head, m, n));
        sllResult.print();
    }

    public static<T> Node<T> deleteNodes(Node<T> head, int m, int n) {

        Node<T> current = head, previous = null;
        int counter_m = m, counter_n = n;
        if (head == null) throw new NoSuchElementException("SLL is empty");

        while (current != null) {
            if (counter_m > 0) {
                previous = current;
                current = current.next;
                counter_m--;
                continue;
            }
            if (counter_n > 0) {
                current = current.next;
                counter_n--;
                previous.next = current;
                continue;
            }
            counter_m = m;
            counter_n = n;
        }
        return head;
    }


}

