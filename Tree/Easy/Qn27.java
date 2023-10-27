//https://leetcode.com/problems/minimum-depth-of-binary-tree/
package Tree.Easy;

import java.util.LinkedList;
import java.util.Queue;

public class Qn27 {
    int ans = 0;
    public int minDepth(TreeNode root) {
        int depth = 0;

        //using DFS here
        if(root == null)
            return 0;

        Queue<TreeNode> Q = new LinkedList<>();
        Q.add(root);
        depth++;

        while(!Q.isEmpty()) {
            int size = Q.size();

            while(size > 0) {
                TreeNode current = Q.poll();
                size--;
                //if we are on leaf node
                if(current.left == null && current.right == null)
                    return depth;

                if(current.left != null)
                    Q.add(current.left);

                if(current.right != null)
                    Q.add(current.right);
            }
            depth++;
        }
        return depth;
    }
}
