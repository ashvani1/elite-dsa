//postOrder Traversal
package Tree.Easy;

import java.util.*;

public class Qn7 {
    public List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postOrderUsingStack(root, list);
        Collections.reverse(list);
        return list;

    }

    private void postOrder(TreeNode root, List answer) {
        if (root == null)
            return;

        postOrder(root.left, answer);
        postOrder(root.right, answer);

        int data = root.val;
        answer.add(data);
    }

    private void postOrderUsingStack(TreeNode root, List<Integer> list) {
        Stack<TreeNode> St = new Stack<>();
        St.add(root);

        if (root == null)
            return;

        while (!St.empty()) {
            TreeNode current = St.pop();
            list.add(current.val);

            if (current.left != null) {
                St.add(current.left);
            }

            if (current.right != null) {
                St.add(current.right);
            }


        }
    }
}

/*
https://leetcode.com/problems/binary-tree-postorder-traversal/
whichever node is coming last time in traversal [root -> left -> right]

 */