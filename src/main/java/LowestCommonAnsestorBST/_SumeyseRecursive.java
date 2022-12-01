package LowestCommonAnsestorBST;

public class _SumeyseRecursive {
    public static void main(String[] args) {

        int[] treeData = {6, 2, 8, 0, 4, 7, 9, 3, 5};
        int p = 4,
                q = 2;

        MyBST tree = new MyBST(treeData);

        VisualizeTree.printTree(tree.root, null, false);

        System.out.println("\nFor nodes " + p + " and " + q + " LCA is  " +
                lowestCommonAncestor(tree.root, tree.nodeByVal(p), tree.nodeByVal(q))
        );
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) return null;

        if (p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left, p, q);

        if (p.val > root.val && q.val > root.val)
            return lowestCommonAncestor(root.right, p, q);

        return root;
    }
}

