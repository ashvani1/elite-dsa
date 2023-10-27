//Sum of Left Leaves
package Tree.Easy;

public class Qn13 {
    public int sumOfLeftLeaves(TreeNode root) {
        int[] a = {0};
        findSumOfLeftLeaves(root, a, "");
        return a[0];
    }

    private void findSumOfLeftLeaves(TreeNode root, int[] ans, String side) {
        if (root == null)
            return;

        if (root.right == null && root.left == null && side == "L") {
            ans[0] = ans[0] + root.val;
        }

        findSumOfLeftLeaves(root.left, ans, "L");
        findSumOfLeftLeaves(root.right, ans, "R");
    }
}
/*
https://leetcode.com/problems/sum-of-left-leaves/
*/