package soloworld.scalar.intermediate.tree;

import soloworld.scalar.util.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/**
 *
 */
public class PreorderTraversal {

    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayList<Integer> res = new ArrayList<>();
        Deque<TreeNode> nodeStack = new ArrayDeque<>();

        TreeNode currrentNode = A;

        while (currrentNode !=null || !nodeStack.isEmpty()) {

            while(currrentNode !=null) {
                res.add(currrentNode.val);
                if(currrentNode.right !=null) {
                    nodeStack.push(currrentNode.right);
                }
                currrentNode = currrentNode.left;
            }
            currrentNode = !nodeStack.isEmpty() ? nodeStack.pop(): null;

        }



        return res;
    }
}
