package PalindromeLinkedList;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Node <T>{

    Node next;
    T value;

    public Node(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value='" + value + '\'' +
                '}';
    }
}