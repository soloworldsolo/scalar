package soloworld.scalar.intermediate.tree;

import soloworld.scalar.util.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;

import static java.util.Collections.reverse;

/**
 * postOrder = L R N(root) ->
 * which can b e done by NRL and reverse it
 *
 *
 */
public class PostOrderTraversal {
    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        ArrayList<Integer> res = new ArrayList<>();
        Deque<TreeNode> nodeStack = new ArrayDeque<>();

        TreeNode currrentNode = A;
        nodeStack.push(A);
        while ( !nodeStack.isEmpty()) {
            currrentNode =  nodeStack.pop();

                res.add(currrentNode.val);
                if (currrentNode.left != null) {
                    nodeStack.push(currrentNode.left);
                }
                if (currrentNode.right != null) {
                    nodeStack.push(currrentNode.right);
                }


        }
        reverse(res);
        return res;
    }

}
