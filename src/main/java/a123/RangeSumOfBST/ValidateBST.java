package a123.RangeSumOfBST;

import java.util.ArrayDeque;
import java.util.function.Function;

public class ValidateBST {
    public static void main(String[] args) {

        MyBST bST = new MyBST();
        bST.insert(new int[]{3, 1, 5, 0, 2, 4, 6});
        //5,4,6,null,null,3,7

        Node n5 = new Node(5);
        Node n4 = new Node(4);
        n5.left = n4;
        Node n6 = new Node(6);
        n5.right = n6;
        Node n3 = new Node(3);
        n6.left = n3;
        Node n7 = new Node(7);
        n6.right = n7;

        Visualize.printTree(n5, null, true);

        System.out.println("\n" + isValidBST(n5));
        System.out.println("\n" + isValidBST1(n5, new ArrayDeque<>()));
    }


    private static boolean isValidBST(Node root) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        return new Function<Node, Boolean>() {
            @Override
            public Boolean apply(Node node) {
                //inOrder traversal and check
                boolean result = true;
                if (node == null) return true;

                result &= apply(node.left);
                if (stack.peek() == null || stack.peek() < node.value) stack.push(node.value);
                else result = false;
                result &= apply(node.right);
                return result;
            }
        }.apply(root);
    }


    private static boolean isValidBST1(Node node, ArrayDeque<Integer> stack) {

        //inOrder traversal and check
        boolean result = true;
        if (node == null) return true;

        result &= isValidBST1(node.left, stack);
        if (stack.peek() == null || stack.peek() < node.value) stack.push(node.value);
        else result = false;
        result &= isValidBST1(node.right, stack);
        return result;

    }
}
