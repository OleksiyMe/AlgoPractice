package LowestCommonAnsestorBST;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Node {
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return ""+'{'+val+'}';
    }
}
