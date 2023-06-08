package interview.equinix.SLL;

import java.util.ArrayList;
import java.util.List;

public class MySLL {

    Node head;

    public MySLL(Node head) {
        this.head = head;
    }

    public MySLL() {

    }

    void add(int value) {

        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }

        if (head.next == null) {
            head.next = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;

    }

    void add(Node newNode) {

        if (head == null) {
            head = newNode;
            return;
        }

        if (head.next == null) {
            head.next = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;


    }

    List<Integer> getSLL() {

        Node current = head;
        List<Integer> result = new ArrayList<>();
        while (current != null) {
            result.add(current.value);
            current = current.next;
        }

        return result;
    }


}
