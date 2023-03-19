package a123.OracleTask;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Binary Tree");

        int[] inputData = {7, 12, 33, 45,1, 1, 4,11,29,5, 6, 4, 5};
        Tree myTree = new Tree();
        for (int each : inputData) {
            Node node = new Node(each);
            myTree.insert(node);
        }

        VisualizeTree.printTree(myTree.getRoot(),null,false);
        System.out.println(myTree.path(6));
        System.out.println(myTree.lca(45,11).value);
        System.out.println("End of program");


    }


}