package a123.SLL_phonebook;

public class SLL_phonebook {
    public Node head;

    public SLL_phonebook() {
    }

    public void insert(PhonebookEntry entry) {
        Node newNode = new Node(entry);
        if (head == null) {
            head = newNode;
        } else if (head.next == null) {
            head.next = newNode;
        } else {
            Node current = head;
            while (current.next != null) current = current.next;
            current.next = newNode;
        }
    }

    public int size() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.value + "\n");
            current = current.next;
        }
        return "SLL_phonebook{\n" + sb + '}';
    }


}










