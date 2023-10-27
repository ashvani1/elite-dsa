//Invert Binary Tree OR Mirror Tree
package Tree.Easy;

public class Qn18 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;
        invertTree(root.left);
        invertTree(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;

    }
}
/*https://leetcode.com/problems/invert-binary-tree/
 */