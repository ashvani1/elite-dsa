//https://leetcode.com/problems/count-complete-tree-nodes/
package Tree.Easy;

public class Qn28 {
    int ans = 0;
    public int countNodes(TreeNode root) {
        if(root == null)
            return ans;
        ans++;    //for root node
        count(root);
        return ans;
    }

    void count(TreeNode root) {
        if(root == null)
            return;
        if(root.left != null) {
            ans++;
            count(root.left);
        }
        if(root.right != null) {
            ans++;
            count(root.right);
        }
    }
}
