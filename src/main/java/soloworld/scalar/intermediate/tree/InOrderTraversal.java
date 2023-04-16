package soloworld.scalar.intermediate.tree;

import soloworld.scalar.util.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class InOrderTraversal {

    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> res = new ArrayList<>();
        Deque<TreeNode> nodeStack = new ArrayDeque<>();
        TreeNode currentNode = A;
        while (currentNode != null || !nodeStack.isEmpty()) {

            while (currentNode != null) {
                nodeStack.push(currentNode);
                currentNode = currentNode.left;
            }

            currentNode = nodeStack.pop();
            if (currentNode != null) {
                res.add(currentNode.val);
            }
            currentNode = currentNode.right;


        }
        return res;
    }
}
