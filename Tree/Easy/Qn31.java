//https://leetcode.com/problems/average-of-levels-in-binary-tree/
package Tree.Easy;
import java.util.*;

public class Qn31 {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> Q = new LinkedList<>();
        List<Double> answer = new ArrayList<>();

        if(root == null)
            return answer;

        Q.add(root);

        while(!Q.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int currentSize = Q.size();
            while(currentSize > 0) {
                TreeNode currentNode = Q.remove();
                level.add(currentNode.val);
                //as we are processing currentNode so decrease currentSize by 1
                currentSize--;

                if(currentNode.left != null)
                    Q.add(currentNode.left);
                if(currentNode.right != null)
                    Q.add(currentNode.right);
            }
            //when currentSize is become 0 add this level to answer
            Double ans = findAverage(level);
            answer.add(ans);
        }
        return answer;

    }

    Double findAverage(List<Integer> list) {
        int size = list.size();
        Double sum = 0d;
        for(int a : list) {
            sum = sum+a;
        }
        return sum/size;
    }
}
