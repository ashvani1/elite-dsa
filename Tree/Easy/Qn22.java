//level order traversal
package Tree.Easy;

import java.util.*;

public class Qn22 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        Queue<TreeNode> Q = new LinkedList<>();
        if (root == null) {
            return answer;
        }
        Q.add(root);

        while (!Q.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int currentSize = Q.size();

            while (currentSize > 0) {
                TreeNode currentNode = Q.poll();
                level.add(currentNode.val);

                //as we are processing currentNode so decrease currentSize by 1
                currentSize--;

                //process left and right child
                if (currentNode.left != null) {
                    Q.add(currentNode.left);
                }

                if (currentNode.right != null) {
                    Q.add(currentNode.right);
                }

            }

            answer.add(level);
        }
        return answer;
    }
}

/*
TC: even though there are 2 while loops, but we are traversing all nodes only once so O[n]
SC: storing all values in our answer array O[n] + storing all nodes in queue O[n] => almost O[2n]

https://leetcode.com/problems/binary-tree-level-order-traversal/

Each time we are finding size of queue since start, polling nodes from queue until size became zero.
So we are adding these nodes data into level, decrease currentSize and process it's left and right

*/


