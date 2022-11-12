package soloworld.scalar.intermediate.tree;

import soloworld.scalar.util.TreeNode;

public class BinaryTreeHeight {
    public int solve(TreeNode A) {
        int   heightOfLeft = treeHeight(A.left);
        int   heightOfRight = treeHeight(A.right);

        return Math.max(heightOfLeft ,heightOfRight) +1;
    }

    private int treeHeight(TreeNode treeNode) {
        if(treeNode == null) {
            return 0;
        }

        return Math.max(treeHeight(treeNode.left), treeHeight(treeNode.right)) +1;
    }
}
