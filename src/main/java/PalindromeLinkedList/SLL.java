package PalindromeLinkedList;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class SLL<T> {
    Node<T> head;



    public boolean isEmpty() {
        if (head == null) return true;
        return false;
    }

    public boolean add(T value) {
        if (isEmpty()) head = new Node<T>(value);
        else{
            Node<T> current=head;
            while (current.next!=null) current=current.next;
            current.next=new Node<T>(value);

        }
        return true;
    }

    public String toString(){
        Node<T> current=head;
        StringBuilder result=new StringBuilder();
        while(current!=null){
            result.append(current.value+"->");
            current=current.next;
        }
       return result.toString();
    }

}