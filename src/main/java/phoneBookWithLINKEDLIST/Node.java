package phoneBookWithLINKEDLIST;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Node {

   public Node next;

    public Contact value;

    public Node(Contact value) {
        this.value = value;
    }
}
