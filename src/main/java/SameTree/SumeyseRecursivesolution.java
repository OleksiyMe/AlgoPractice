package SameTree;




public class SumeyseRecursivesolution {

    public static void main(String[] args) {

        TreeNode root1 = new TreeNode(9,
                new TreeNode(8, new TreeNode(7), new TreeNode(3)),
                new TreeNode(5)
        );
        VisualizeTree.printTree(root1, null, false);
        TreeNode root2 = new TreeNode(9,
                new TreeNode(8, new TreeNode(7), new TreeNode(3)),
                new TreeNode(5)
        );
        VisualizeTree.printTree(root2, null, false);

        System.out.println("The same?  " + isSameTree(root1, root2));

    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p==null && q==null) return true;
        if(p==null|| q==null) return false;

        if (p.val!=q.val) return false;


        return isSameTree(p.right,q.right) && isSameTree(p.left,q.left);

    }


}
