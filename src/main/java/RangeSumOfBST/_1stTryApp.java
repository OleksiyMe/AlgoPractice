package RangeSumOfBST;

public class _1stTryApp {
    public static void main(String[] args) {

        TreeNode root1 = new TreeNode(9,
                new TreeNode(5, new TreeNode(3), new TreeNode(6)),
                new TreeNode(10)
        );
        VisualizeTree.printTree(root1, null, false);
        int low = 5, high = 10;

        System.out.println("\nSum of elements greater than " + low +
                "\n and lower than " + high +
                "\n is " + rangeSumBST(root1, low, high));


    }


    public static int rangeSumBST(TreeNode p, int low, int high) {
        if (p == null) return 0;
        int sum = 0;
        if (p.val >= low && p.val <= high) {
            sum += p.val;
            System.out.print(p.val + ", ");
        }

        return sum + rangeSumBST(p.left, low, high) + rangeSumBST(p.right, low, high);
    }
}

