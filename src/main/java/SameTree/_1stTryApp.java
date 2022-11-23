package SameTree;

public class _1stTryApp {
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

    private static boolean isSameTree(TreeNode p, TreeNode q) {
        result = true;
        preOrderTraversal(p, q);
        return result;
    }

    public static boolean result;

    public static void preOrderTraversal(TreeNode p, TreeNode q) {

        if (p==null && q!=null){
            result=false;
            return;
        }
        if (p!=null && q==null){
            result=false;
            return;
        }
        if (p == null && q == null) return;

        result &= (p.val == q.val);
        System.out.println("p=" + p.val + " q=" + q.val);
        preOrderTraversal(p.left, q.left);
        preOrderTraversal(p.right, q.right);

    }
}

