//Maximum Depth of Binary Tree
package Tree.Easy;

public class    Qn1 {
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}

/*
https://leetcode.com/problems/maximum-depth-of-binary-tree/
A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

TC => O[n] : where n is number of nodes and as we are visiting every node only once so TC will be O[n]
SC => O[h] : where h is the height of tree, our recursive stack will be holding nodes from largest branch, in worst case
it will be O[n]
* */