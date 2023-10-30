//Binary Tree Paths
package Tree.Easy;

import java.util.*;

public class Qn12 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        findPaths(root, list, "");
        return list;
    }

    void findPaths(TreeNode root, List<String> list, String currentString) {
        if(root == null)
            return;

        if(currentString.length() == 0)
            currentString = currentString + root.val;

        else
            currentString = currentString + "->" + (root.val);

        if(root.left == null && root.right == null)
            list.add(currentString);

        findPaths(root.left, list, currentString);
        findPaths(root.right, list, currentString);
    }
}
/*
https://leetcode.com/problems/binary-tree-paths/

TC : O[n]
SC : at any point on leaf node we have values stored from root to leaf, we can say it is taking x space,
also at any point we need O[h] auxiliary space
*/