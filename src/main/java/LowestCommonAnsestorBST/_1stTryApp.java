package LowestCommonAnsestorBST;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class _1stTryApp {
    public static void main(String[] args) {

        ArrayList<Integer> treeData = new ArrayList<>(Arrays.asList(6, 2, 8, 0, 4, 7, 9, 3, 5));
        int p = 3,
            q = 5;

        MyBST tree = new MyBST();

        for (Integer each : treeData) {
            tree.insert(each);
        }
       VisualizeTree.printTree(tree.root, null, false);

       System.out.println("\nFor nodes " + p + " and " + q + " LCA is  " +
                lowestCommonAncestor(tree.root, tree.nodeByVal(p), tree.nodeByVal(q))
        );
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (p == root || q == root) return root;  //if one of the nodes root --answer root
        if (p.val < root.val && q.val > root.val ||
                q.val < root.val && p.val > root.val) return root; //if nodes in different subtrees, answer root

        //if both nodes in left subtree go to the left subtree
        if (p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left, p, q);
        //else go to the right subtree
        return lowestCommonAncestor(root.right, p, q);


    }


}

