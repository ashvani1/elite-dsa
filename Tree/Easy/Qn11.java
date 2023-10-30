//Univalued Binary Tree
package Tree.Easy;
import java.util.*;

public class Qn11 {
    boolean f = true;
    public boolean isUnivalTree(TreeNode root) {
        //return bfsSolution(root);
        return dfsSolution(root);
    }

    boolean dfsSolution(TreeNode root) {
        if(root == null)
            return true;

        Queue<TreeNode> Q = new LinkedList<>();
        Q.add(root);
        int value = root.val;
        while(!Q.isEmpty()) {
            TreeNode current = Q.remove();
            if(current.val != value)
                return false;

            if(current.left != null)
                Q.add(current.left);

            if(current.right != null)
                Q.add(current.right);
        }
        return true;
    }





    boolean bfsSolution(TreeNode root) {
        //will implement by preorder
        int value = root.val;
        uniVal(root, value);
        return f;
    }

    void uniVal(TreeNode root, int value) {
        if(root == null)
            return;

        if(value != root.val)
            f = false;

        uniVal(root.left, value);
        uniVal(root.right, value);
    }
}
/*
https://leetcode.com/problems/univalued-binary-tree/
*/
