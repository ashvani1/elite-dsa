//Right view of binary tree
package Tree.Easy;

import java.util.*;

public class Qn16 {
    public List<Integer> rightSideView(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null)
            return list;

        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 1; i <= size; i++) {

                TreeNode current = queue.remove();
                if (i == size) {

                    list.add(current.val);
                }

                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }
        return list;

    }
}

/*https://leetcode.com/problems/binary-tree-right-side-view
 * */
