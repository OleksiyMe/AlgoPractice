package SameTree;

public class _2ndTryApp {
    public static void main(String[] args) {

        TreeNode root1 = new TreeNode(10,
                new TreeNode(8, new TreeNode(7), new TreeNode(3)),
                new TreeNode(5)
        );
        VisualizeTree.printTree(root1, null, false);
        TreeNode root2 = new TreeNode(10,
                new TreeNode(8, new TreeNode(7), new TreeNode(3)),
                new TreeNode(5)
        );
        VisualizeTree.printTree(root2, null, false);

        System.out.println("The same?  " + isSameTree(root1, root2));

    }




    public static boolean isSameTree(TreeNode p, TreeNode q) {
        boolean result=true;

        if ( (p==null && q!=null)||(p!=null && q==null) ) return false;
        if (p == null && q == null) return result;

        result = p.val == q.val;
        System.out.println("p=" + p.val + " q=" + q.val);

        return result && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

