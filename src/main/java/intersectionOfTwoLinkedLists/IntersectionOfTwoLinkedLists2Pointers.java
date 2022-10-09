package intersectionOfTwoLinkedLists;

import java.util.HashSet;

public class IntersectionOfTwoLinkedLists2Pointers {
    public static void main(String[] args) {

        Node b1 = new Node("b1");
        SLL sll1 = new SLL(b1);
        Node b2 = new Node("b2");
        b1.next = b2;
        Node b3 = new Node("b3");
        b2.next = b3;

        Node c1 = new Node("c1");
        b3.next = c1;
        Node c2 = new Node("c2");
        c1.next = c2;
        Node c3 = new Node("c3");
        c2.next = c3;

        Node a1 = new Node("a1");
        SLL sll2 = new SLL(a1);
        Node a2 = new Node("a2");
        a1.next = a2;
        a2.next = c1;

        Node current1 = sll1.head;
        Node current2 = sll2.head;

        System.out.println(giveMeIntersection(current2, current1));
    }

    private static Node giveMeIntersection(Node headA, Node headB) {
        Node pointer1 = headA;
        Node pointer2 = headB;
        int steps1 = 0, steps2 = 0;

        if (headA == headB) return headA;

        while (!(pointer1.next == null && pointer2.next == null)) {
            if (pointer1.next != null) {
                pointer1 = pointer1.next;
                steps1++;
            }
            if (pointer2.next != null) {
                pointer2 = pointer2.next;
                steps2++;
            }
        }
        int k = steps2 - steps1;
        if (k >= 0) {
            pointer1 = headA;
            pointer2 = headB;
            for (int i = 1; ; i++) {
                if (i > k) pointer1 = pointer1.next;
                pointer2 = pointer2.next;
                if (pointer1 == pointer2) return pointer1;
            }
        }
        if (k<0) {
            pointer1 = headA;
            pointer2 = headB;
            for (int i = 1; ; i++) {
                if (i > (-k)) pointer2 = pointer2.next;
                pointer1 = pointer1.next;
                if (pointer1 == pointer2) return pointer1;
            }
        }
        return null;

    }


}
