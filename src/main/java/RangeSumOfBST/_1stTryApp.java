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

        int[] result = new int[1];
        rangeSumBST1(root1, low, high, result);
        System.out.println(result[0]);
        int sum=0;
        rangeSumBST2(root1, low, high, sum);
        System.out.println(sum);

    }




    public static int rangeSumBST(TreeNode p, int low, int high) {
        if (p == null) return 0;
        int sum = 0;
        if (p.val >= low && p.val <= high) {
            sum += p.val;
            // System.out.print(p.val + ", ");
        }
        // line 40 is equal to
         sum+= rangeSumBST(p.left, low, high);
         sum+= rangeSumBST(p.right, low, high);
        return sum;
//        return sum +
//                rangeSumBST(p.left, low, high) +
//                rangeSumBST(p.right, low, high);
    }

    public static void rangeSumBST1(TreeNode p, int low, int high, int[] array) {
        if (p == null) return;

        if (p.val >= low && p.val <= high) {
            array[0] = array[0] + p.val;
            // System.out.print(p.val + ", ");
        }
        rangeSumBST1(p.left, low, high, array);
        rangeSumBST1(p.right, low, high, array);
        // return array[0] + rangeSumBST(p.left, low, high) + rangeSumBST(p.right, low, high);
    }

    public static int rangeSumBST2(TreeNode p, int low, int high, int array) {
        if (p == null) return 0;

        if (p.val >= low && p.val <= high) {
            array = array + p.val;
            // System.out.print(p.val + ", ");
        }
        return array +rangeSumBST2(p.left, low, high, array)+
                rangeSumBST2(p.right, low, high, array);
        // return array[0] + rangeSumBST(p.left, low, high) + rangeSumBST(p.right, low, high);
    }



}

