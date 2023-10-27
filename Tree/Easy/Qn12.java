//Binary Tree Paths
package Tree.Easy;

import java.util.*;

public class Qn12 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        findPaths(root, list, "");
        return list;
    }

    private void findPaths(TreeNode root, List<String> ans, String currentAns) {
        if (root == null)
            return;

        if (root.left == null && root.right == null) {
            currentAns = currentAns + String.valueOf(root.val);
            ans.add(currentAns);
            currentAns = "";
        }

        currentAns = currentAns + String.valueOf(root.val);

        findPaths(root.left, ans, currentAns + "->");

        findPaths(root.right, ans, currentAns + "->");

    }
}
/*
https://leetcode.com/problems/binary-tree-paths/

TC : O[n]
SC : at any point on leaf node we have values stored from root to leaf, we can say it is taking x space,
also at any point we need O[h] auxiliary space
*/