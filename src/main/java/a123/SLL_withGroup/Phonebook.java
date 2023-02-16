package a123.SLL_withGroup;

public class Phonebook {
    public Node head;
    public Node tail;
    public int size;

    public Phonebook() {
        this.size = 0;
    }

    public void insert(String name, String lastName, String email, String phoneNumber) {
        Node node = new Node(name, lastName, email, phoneNumber);
        if (head == null) {
            head = node;
            tail = head;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public int indexOf(String email) {
        Node current = head;
        int index = 0;

        while (current != null) {
            if (current.email.equals(email)) return index;
            index++;
            current = current.next;
        }
        return -1;
    }

    public int findByName(String name) {
        Node current = head;
        int index = 0;

        while (current != null) {
            if (current.name.equals(name)) return index;
            index++;
            current = current.next;
        }
        return -1;
    }

    boolean isEmpty() {
        return head == null;
    }

    void deleteByEmail(String email) {
//find the node to be deleted
        if (isEmpty()) {
            System.out.println("List empty");
            return;
        }
//if found checked
        Node current = head, prev = head;

        while (current != null) {
            if (current.email.equals(email)) {
                if (current == head) {
                    head = current.next;
                    current.next = null;
                } else if (current == tail) {
                    tail = prev;
                    prev.next = null;
                } else {
                    prev.next = current.next;
                    current.next = null;
                }
                size--;
            }
            current = current.next;
        }


    }

    void swapData(Node node1, Node node2) {
        Node temp = new Node(node2.name, node2.lastName, node2.email, node2.phoneNumber);

        node2.name = node1.name;
        node2.lastName = node1.lastName;
        node2.email = node1.email;
        node2.phoneNumber = node1.phoneNumber;

        node1.name = temp.name;
        node1.lastName = temp.lastName;
        node1.email = temp.email;
        node1.phoneNumber = temp.phoneNumber;
    }

    void sortByName() {
        if (head.next == null) return;
        Node current = head, current2 = head.next;

        boolean swap = true;

        while (swap) {
            swap = false;
            current = head;
            current2 = current.next;
            while (current != null && current2 != null) {
                if (current.name.compareToIgnoreCase(current2.name) > 0) {
                    swapData(current, current2);
                    swap = true;
                }
                current = current.next;
                current2 = current2.next;
            }
        }
    }

    public void deleteDuplicates() {
        Node current = head;
        while (current != null) {
            Node theNext = current.next;
            while (theNext != null && theNext.email.equals(current.email)) {
                theNext = theNext.next;
            }
            current.next = theNext;
            current = theNext;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.name + " " + current.lastName + " " + current.email + " " + current.phoneNumber + "\n");
            current = current.next;
        }
        return "SLL_phonebook{\n" + sb + '}';
    }


}
















