//https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
package Tree.Easy;

public class Qn36 {
    int result = 0;
    public int sumRootToLeaf(TreeNode root) {
        //we can't use only int answer as integer is call by value so each time it will be set as 0 in call of methods recursively
        //so either use class level variable like result or use int[] answer
        int[] answer = {0};
        rootToLeaf(root, "", answer);
        return result;
    }

    private void rootToLeaf(TreeNode root, String currentPath, int[] answer) {
        if(root == null)
            return;

        //leaf node
        if(root.left == null && root.right == null) {
            currentPath += String.valueOf(root.val);
            int currentPathSum = Integer.parseInt(currentPath, 2);            //will convert String to integer with binary to decimal
            answer[0] = answer[0] + currentPathSum;
            result = result + currentPathSum;
        }

        rootToLeaf(root.left, currentPath + String.valueOf(root.val), answer);

        rootToLeaf(root.right, currentPath+ String.valueOf(root.val), answer);
    }
}


