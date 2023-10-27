//Symmetric Tree
package Tree.Easy;

public class Qn19 {
    public boolean isSymmetric(TreeNode root) {
        return symmetricTree(root.left, root.right);
    }

    boolean symmetricTree(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)
            return true;

        if (t1 == null || t2 == null || t1.val != t2.val)
            return false;
        //check root's left and right in such a way that left child of right node is equal to right child of left node and more..
        return symmetricTree(t1.left, t2.right) && symmetricTree(t1.right, t2.left);
    }
}

/*https://leetcode.com/problems/symmetric-tree/
 */