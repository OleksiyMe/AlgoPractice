package a123.TreesWithFatih.src.main.java.Session_8;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class PhoneBookTree {

    CustomerNode root;

    public PhoneBookTree() {
        this.root = null;
    }

    void insert(CustomerNode newNode) {

        if (root == null) {
            root = newNode;
            return;
        }
        CustomerNode current = root;
        while (true) {
            if (newNode.firstName.compareToIgnoreCase(current.firstName) < 0) {
                //go to the left
                if (current.leftChild == null) {
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild; // branch left
            } else {
                //go to the right (greater or equal than current)
                if (current.rightChild == null) {
                    current.rightChild = newNode;
                    break;
                }
                current = current.rightChild; //branch right
            }
        }
    }

    void printNamesInAscOrder(CustomerNode root) {
        if (root == null) return;
        printNamesInAscOrder(root.leftChild);
        System.out.println(root.firstName + " ");
        printNamesInAscOrder(root.rightChild);

    }

    List<String> firstNamesList(CustomerNode root) { // This is an In Order Traversal Iteratively
        List<String> result = new ArrayList<>();

        new Consumer<CustomerNode>() {
            @Override
            public void accept(CustomerNode node) {
                if (node == null) return;
                accept(node.leftChild);
                result.add(node.firstName);
                accept(node.rightChild);
            }
        }.accept(root);

        return result;
    }


    List<String> firstNamesList1(CustomerNode root, List<String> list) { // This is an In Order Traversal Iteratively

        if (root == null) return list;
        firstNamesList1(root.leftChild, list);
        list.add(root.firstName);
        firstNamesList1(root.rightChild, list);
        return list;

    }


    List<String> firstNamesList3(CustomerNode root) { // This is an In Order Traversal Iteratively
        List<String> result = new ArrayList<>();
        if (root == null) return result;
        result.addAll(firstNamesList3(root.leftChild));
        result.add(root.firstName);
        result.addAll(firstNamesList3(root.rightChild));
        return result;

    }

    // return size or number of entries in the phonebook


}


