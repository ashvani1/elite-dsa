package Tree.Easy;
import java.util.*;
public class Qn32 {
    public boolean findTarget(TreeNode root, int k) {

        List<Integer> traversal = new ArrayList<>();
        inOrderTraversal(root, traversal);

        int i = 0;
        int j = traversal.size() - 1;
        while(i < j) {
            if(traversal.get(i) + traversal.get(j) == k) {
                return true;
            }
            else if(traversal.get(i) + traversal.get(j) < k) {
                i++;
            }

            else
                j--;
        }
        return false;
    }
    private void inOrderTraversal(TreeNode root, List<Integer> answer) {
        if(root == null)
            return;

        inOrderTraversal(root.left, answer);
        answer.add(root.val);
        inOrderTraversal(root.right, answer);

    }
}
