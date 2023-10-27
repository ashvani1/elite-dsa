//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
package Tree.Easy;

public class Qn26 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return arrayToBST(nums, 0, nums.length-1);
    }

    private TreeNode arrayToBST(int[] nums, int start, int end) {
        if(start > end) {
            return null;
        }

        int mid = (start+end)/2;

        TreeNode root = new TreeNode(nums[mid]);

        root.left = arrayToBST(nums, start, mid-1);
        root.right = arrayToBST(nums, mid+1, end);

        return root;
    }
}