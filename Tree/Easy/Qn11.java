//Univalued Binary Tree
package Tree.Easy;

public class Qn11 {
    public boolean isUniValueTree(TreeNode root) {
        if (root == null)
            return true;
        return findVal(root, root.val);
    }

    private boolean findVal(TreeNode root, int rootVal) {
        if (root == null)
            return true;

        if (root.val != rootVal)
            return false;

        boolean leftAns = true;
        boolean rightAns = true;
        if (root.left != null)
            leftAns = findVal(root.left, rootVal);

        if (root.right != null)
            rightAns = findVal(root.right, rootVal);


        return (leftAns && rightAns);
    }
}
/*
https://leetcode.com/problems/univalued-binary-tree/
*/
