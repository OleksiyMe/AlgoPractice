package phoneBookWithLINKEDLIST;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class SLL {

    public Node head, tail;
    public int size;


    public boolean isEmpty() {
        return head == null;

    }

    public int size() {

        return size;
    }

    public void printPhoneBook() {
        if (isEmpty()) throw new NoSuchElementException("No records");

        Node current = head;
        while (current != null) {

            System.out.println(current);
            current = current.next;
        }
    }

    public void add(Contact contact) {

        Node node = new Node(contact);
        if (isEmpty()) {
            head = tail = node;
        } else {

            tail.next = node;
            tail = node;
        }

        size++;
    }

    public Node findByFirstName(String firstName) {

        if (isEmpty()) throw new NoSuchElementException("No records");

        Node current = head;

        while (current != null) {

            if (current.value.firstName.equals(firstName)) return current;

            current = current.next;
        }
        return null;
    }

    public List<Node> findAllByLastName(String lastName) {
        if (isEmpty()) throw new NoSuchElementException("No records");

        List<Node> myList = new ArrayList<>();
        Node current = head;
        while (current != null) {

            if (current.value.firstName.equals(lastName)) {
                myList.add(current);
            }
            current = current.next;
        }
        return myList;
    }


    public void deleteByFirstName(String firstName) {
        if (isEmpty())
            throw new NoSuchElementException("No records with firstName: " + firstName);
        Node current = head, previous = head;
        while (current != null) {

            if (current.value.firstName.equals(firstName)) {
                if (current == head) {
                    if (size == 1) {
                        head = null;
                        tail = null;
                    } else {
                        head = current.next;
                    }
                } else if (current == tail) {
                    tail = previous;
                    tail.next = null;
                } else {
                    previous.next = current.next;

                }
                size--;
                return;
            }
            previous=current;
            current=current.next;
        }

    }


}
