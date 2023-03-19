package a123.OracleTask;

import java.util.ArrayList;

class Tree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void insert(Node newNode) {

        if (root == null) {
            root = newNode;
            return;
        }
        Node currentNode = root;
        while (true) {
            if (newNode.value < currentNode.value) {
                if (currentNode.left == null) {
                    currentNode.left = newNode;
                    return;
                }
                currentNode = currentNode.left;
            } else if (newNode.value > currentNode.value) {
                if (currentNode.right == null) {
                    currentNode.right = newNode;
                    return;
                }
                currentNode = currentNode.right;
            } else return;
        }
    }

    public ArrayList<Integer> path(int searchValue) {
        ArrayList<Integer> result = new ArrayList<>();
        Node current = root;
        while (current != null) {
            if (searchValue > current.value) {
                result.add(current.value);
                current = current.right;
                continue;
            } else if (searchValue < current.value) {
                result.add(current.value);
                current = current.left;
                continue;
            } else {
                result.add(current.value);
                return result;
            }
        }
        return new ArrayList<>();
    }

    public Node lca(int a, int b) {
        return lca(root, a, b);
    }

    public Node lca(Node root, int a, int b) {

        if (root == null || a == root.value || b == root.value) return root;
        Node left = lca(root.left, a, b);
        Node right = lca(root.right, a, b);

        if (left == null) return right;
        if (right == null) return left;
        return root;
    }
}
