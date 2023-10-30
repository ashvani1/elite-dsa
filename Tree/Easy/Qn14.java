//Path Sum
package Tree.Easy;

public class Qn14 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return findPathSum(root, targetSum, 0);
    }

    private boolean findPathSum(TreeNode root, int targetSum, int currentSum) {
        if (root == null)
            return false;

        if (root.left == null && root.right == null) {
            //We are on leaf node, consider it only for calculation the sum and if it is not equal to target sum
            //this is not going to be consider for further branches from here.
            return (targetSum == currentSum + root.val);
        }

        return findPathSum(root.left, targetSum, currentSum + root.val) ||
                findPathSum(root.right, targetSum, currentSum + root.val);
    }
}

//https://leetcode.com/problems/path-sum/