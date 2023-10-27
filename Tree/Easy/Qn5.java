//Binary Tree Inorder Traversal
package Tree.Easy;
import java.util.*;
public class Qn5 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        return list;
    }

    private void inOrder(TreeNode root, List list) {
        if (root == null)
            return;

        inOrder(root.left, list);
        int data = root.val;
        list.add(data);
        inOrder(root.right, list);

    }
}
/*
https://leetcode.com/problems/binary-tree-inorder-traversal/
whichever node is coming second time in traversal [root -> left -> right]
* */