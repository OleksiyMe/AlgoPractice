package intersectionOfTwoLinkedLists;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Node {

    Node next;
    String value;

    public Node(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value='" + value + '\'' +
                '}';
    }
}