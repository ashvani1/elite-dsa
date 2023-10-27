//preOrder traversal
package Tree.Easy;

import java.util.*;

public class Qn3 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrderUsingStack(root, list);
        return list;
    }

    private void preOrderUsingStack(TreeNode root, List list) {
        Stack<TreeNode> St = new Stack<>();
        St.add(root);

        if (root == null)
            return;

        while (!St.empty()) {
            TreeNode current = St.pop();
            list.add(current.val);

            if (current.right != null) {
                St.add(current.right);
            }

            if (current.left != null) {
                St.add(current.left);
            }

        }
    }

    private void preOrder(TreeNode root, List list) {
        if (root == null)
            return;

        int data = root.val;
        list.add(data);
        preOrder(root.left, list);
        preOrder(root.right, list);

    }
}
/*
https://leetcode.com/problems/binary-tree-preorder-traversal/

whichever node is coming first time in traversal [root -> left -> right]
* */