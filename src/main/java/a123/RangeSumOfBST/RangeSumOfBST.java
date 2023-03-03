package a123.RangeSumOfBST;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;

public class RangeSumOfBST {
    public static void main(String[] args) {

        MyBST bST = new MyBST();
        bST.insert(new int[]{10, 5, 15, 3, 7, 18});

        Visualize.printTree(bST.root, null, true);

        System.out.println("\n" + rangeSumOfBST2(bST.root, 7, 15));

    }

    private static int rangeSumOfBST(Node root, int min, int max) {

        return new Function<Node, Integer>() {
            @Override
            public Integer apply(Node node) {
                int result = 0;
                if (node == null) return 0;
                if (node.value >= min && node.value <= max) {
                    result = node.value;
                    System.out.print(node.value + ", ");
                }
                return result + apply(node.left) + apply(node.right);
            }
        }.apply(root);

    }


    private static int rangeSumOfBST1(Node root, int min, int max) {

        int[] array = new int[1];
        new Consumer<Node>() {
            @Override
            public void accept(Node node) {
                if (node == null) return;
                if (node.value >= min && node.value <= max) array[0] = array[0] + node.value;
                accept(node.left);
                accept(node.right);
            }
        }.accept(root);
        return array[0];

    }

    private static int rangeSumOfBST2(Node root, int min, int max) {

        class Value {
            int val;

            public Value() {
                this.val = 0;
            }
        }
        Value val = new Value();
        new Consumer<Node>() {
            @Override
            public void accept(Node node) {
                if (node == null) return;
                if (node.value >= min && node.value <= max) val.val = val.val + node.value;
                accept(node.left);
                accept(node.right);
            }
        }.accept(root);
        return val.val;

    }

}
