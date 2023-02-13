package a123.MiddleOfSLL;

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
