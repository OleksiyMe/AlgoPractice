package intersectionOfTwoLinkedLists;

import java.util.HashSet;

public class IntersectionHash_bySumeyse {

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

        System.out.println(giveMeIntersection(current1, current2));

    }

    private static Node giveMeIntersection(Node headA, Node headB) {


        HashSet<Node> set = new HashSet<>();

        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (set.contains(headB)) return headB;
            headB = headB.next;
        }
        return null;
    }
}
