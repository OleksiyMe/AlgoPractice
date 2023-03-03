package a123.RangeSumOfBST;

public class MyBST {

    Node root;

    public MyBST() {
        this.root = null;
    }

    void insert(Node newNode) {

        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        while (true) {
            if (newNode.value < current.value) {
                //go to the left
                if (current.left == null) {
                    current.left = newNode;
                    break;
                }
                current = current.left; // branch left
            } else {
                //go to the right (greater or equal than current)
                if (current.right == null) {
                    current.right = newNode;
                    break;
                }
                current = current.right; //branch right
            }
        }
    }

    void insert(int[] array) {
        for (int every : array) {
            Node node = new Node(every);
            insert(node);

        }

    }


}
