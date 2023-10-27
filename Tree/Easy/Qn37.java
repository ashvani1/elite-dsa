//https://leetcode.com/problems/evaluate-boolean-binary-tree/
package Tree.Easy;

public class Qn37 {
    public boolean evaluateTree(TreeNode root) {

        //leaft node can have either 0 or 1
        if(root.left == null && root.right == null) //leaf node
        {
            if(root.val == 1)
                return true;
            if(root.val == 0)
                return false;
        }

        if(root.val == 2)
            return evaluateTree(root.left) || evaluateTree(root.right);

        //if(root.val == 3) [only this case pending]
        return evaluateTree(root.left) && evaluateTree(root.right);

    }
}
