//Merge Two Binary Trees
package Tree.Easy;

public class Qn10 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)
            return null;

        if (root1 == null)
            return root2;

        if (root2 == null)
            return root1;

        TreeNode root = new TreeNode(root1.val + root2.val);
        root.left = mergeTrees(root1.left, root2.left);
        root.right = mergeTrees(root1.right, root2.right);

        return root;
    }
}

/*
https://leetcode.com/problems/merge-two-binary-trees/
run preOrder traversal for both the trees simultaneously

TC => O[m + n]
SC => O[max(m,n)]
* */