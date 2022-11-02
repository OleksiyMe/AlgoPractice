package DeleteNnodesAfterMnodesOfSLL;

import java.util.NoSuchElementException;

public class DeleteNnodesAfterMnodesOfSLL_Sumeyse {

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

    public static <T> Node<T> deleteNodes(Node<T> head, int m, int n) {

        Node<T> curent = head, last = head;
        while (curent != null) {
            int mConut = m, nCount = n;

            while (curent != null && mConut != 0) {
                last = curent;
                curent = curent.next;
                mConut--;
            }
            while (curent != null && nCount != 0) {
                curent = curent.next;
                nCount--;
            }
            last.next = curent;
        }
        return head;
    }
}

