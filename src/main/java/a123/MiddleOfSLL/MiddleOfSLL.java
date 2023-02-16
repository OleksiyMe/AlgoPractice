package a123.MiddleOfSLL;

public class MiddleOfSLL {

    public static void main(String[] args) {

        Node head = new Node(0);
        Node n1 = new Node(1);
        head.next = n1;
        Node n2 = new Node(2);
        n1.next = n2;
        Node n3 = new Node(3);
        n2.next = n3;
//        Node n4 = new Node(4);
//        n3.next = n4;
        Node.print(head);
        System.out.println("Middle node is "+middleOfSLL(head));
    }

    static Node middleOfSLL(Node head) {
        Node pointerSlow=head, pointerFast=head;
        while (pointerFast!=null&&pointerFast.next!= null) {
            pointerSlow = pointerSlow.next;
            pointerFast = pointerFast.next.next;
        }
        return pointerSlow;
    }
}
