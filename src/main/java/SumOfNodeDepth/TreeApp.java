package SumOfNodeDepth;

public class TreeApp {
    public static void main(String[] args) {
        MyTree tree=new MyTree();
        int[] numbers=new int[] {10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};
        for (int i = 0; i <11; i++) {
            tree.insert(numbers[i]);
        }
      VisualizeTree.printTree(tree.root,null,false);

        System.out.println("Pre Order Traversal :");
        tree.preOrderTraversal(tree.root);
        System.out.println();
        System.out.println("In Order Traversal :");
        tree.inOrderTraversalByMe(tree.root);
        System.out.println();
        System.out.println("Post Order Traversal: ");
        tree.postOrderByMe(tree.root);
        System.out.println();
        System.out.println("Level Order Traversal: ");
      //  tree.levelOrderTraversal();
        tree.levelTraversalByMe();

        System.out.println("\n Tree contains 17  "+ tree.contains(17));

        tree.printLeaves(tree.root);
        System.out.println();
        System.out.println(tree.countLeaves(tree.root) +"  --  number of leaves");
        System.out.println(tree.countLeaves());
        System.out.println();
        tree.printLeaves(tree.root);
        System.out.println("\nSum of values of leaves is "+ tree.findSumOfLeaves());

        System.out.println("Height is "+ tree.height(tree.root));

    }


}
