//Leaf-Similar Trees
package Tree.Easy;

import java.util.*;

public class Qn9 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        collectLeafNodes(root1, list1);
        collectLeafNodes(root2, list2);

        if (list1.size() != list2.size()) {
            return false;
        } else {
            int i = 0;
            while (i < list1.size() && i < list2.size()) {
                if (list1.get(i) != list2.get(i)) {
                    return false;
                }

                i++;
            }
        }
        return true;
    }

    private void collectLeafNodes(TreeNode root, List<Integer> list) {
        if (root == null)
            return;

        if (root.left == null && root.right == null)
            list.add(root.val);

        if (root.left != null) {
            collectLeafNodes(root.left, list);
        }

        if (root.right != null) {
            collectLeafNodes(root.right, list);
        }

    }
}
/*
https://leetcode.com/problems/leaf-similar-trees/
* */