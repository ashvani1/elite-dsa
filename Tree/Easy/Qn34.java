//https://leetcode.com/problems/increasing-order-search-tree/
package Tree.Easy;
import java.util.*;

public class Qn34 {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        inOrderTraversal(root, list);

        System.out.println(list.size());

        TreeNode dummyNode = new TreeNode(-1);
        TreeNode newRoot = dummyNode;
        for(Integer i : list) {
            dummyNode.right = new TreeNode(i);
            dummyNode = dummyNode.right;
        }
        return newRoot.right;

    }

    void inOrderTraversal(TreeNode root, List<Integer> list) {
        if(root == null)
            return;

        inOrderTraversal(root.left, list);
        list.add(root.val);
        inOrderTraversal(root.right, list);
    }
}

/*
InOrder traversal of BST will always give sorted tree in ascending order.

*/