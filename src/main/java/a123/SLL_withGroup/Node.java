package a123.SLL_withGroup;

public class Node {

    public String name;
    public String lastName;
    public String email;
    public String phoneNumber;

    public Node next;


    public Node(String name, String lastName, String email, String phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
