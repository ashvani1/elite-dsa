//N-ary Tree Level Order Traversal
package Tree.Easy;
import java.util.*;

public class Qn23 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> answer = new ArrayList<>();
        Queue<Node> Q = new LinkedList<>();
        if (root == null) {
            return answer;
        }
        Q.add(root);

        while (!Q.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int currentSize = Q.size();

            while (currentSize > 0) {
                Node currentNode = Q.poll();
                level.add(currentNode.val);

                //as we are processing currentNode so decrease currentSize by 1
                currentSize--;

                //process all childrens

                for (Node child : currentNode.children) {
                    Q.add(child);
                }

            }

            answer.add(level);
        }
        return answer;
    }
}

/*
https://leetcode.com/problems/n-ary-tree-level-order-traversal/
TC: even though there are 1 while and 1 for loop but we are traversing all nodes only once so O[n]
SC: storing all values in our answer array O[n] + storing all nodes in queue O[n] => almost O[2n]
*/
