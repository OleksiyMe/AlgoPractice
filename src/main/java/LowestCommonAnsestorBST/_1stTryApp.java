package LowestCommonAnsestorBST;

public class _1stTryApp {
    public static void main(String[] args) {

        int[] treeData = {6, 2, 8, 0, 4, 7, 9, 3, 5};
        int     p = 4,
                q = 2;

        MyBST tree = new MyBST(treeData);

        VisualizeTree.printTree(tree.root, null, false);

        System.out.println("\nFor nodes " + p + " and " + q + " LCA is  " +
                lowestCommonAncestor(tree.root, tree.nodeByVal(p), tree.nodeByVal(q))
        );
    }

    public static Node lowestCommonAncestor(Node root, Node p, Node q) {

        if (p == root || q == root) return root;  //if one of the nodes root --answer root
        if (p.val < root.val && q.val > root.val ||
                q.val < root.val && p.val > root.val) return root; //if nodes in different subtrees, answer root

        //if both nodes in left subtree go to the left subtree
        if (p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left, p, q);
        //else go to the right subtree
        return lowestCommonAncestor(root.right, p, q);
    }
}

