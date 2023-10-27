//Print all nodes that don't have sibling
package Tree.Easy;

import java.util.*;

public class Qn21 {
    ArrayList<Integer> noSibling(TreeNode node) {
        ArrayList<Integer> ans = new ArrayList<>();
        findNoSib(node, ans);
        if (ans.size() == 0) {
            ans.add(-1);
            return ans;
        }
        Collections.sort(ans);
        return ans;
    }

    void findNoSib(TreeNode node, ArrayList<Integer> ans) {

        if (node == null)
            return;

        if (node.left == null && node.right == null)
            return;


        if (node.left != null && node.right != null) {
            findNoSib(node.left, ans);
            findNoSib(node.right, ans);
        } else if (node.left != null) {
            ans.add(node.left.val);
            findNoSib(node.left, ans);
        } else if (node.right != null) {
            ans.add(node.right.val);
            findNoSib(node.right, ans);
        }
    }
}

/*
https://practice.geeksforgeeks.org/problems/print-all-nodes-that-dont-have-sibling/1
If a node has left and right child, don't consider
if node is null don't consider
if node has either left or right child then consider
*/