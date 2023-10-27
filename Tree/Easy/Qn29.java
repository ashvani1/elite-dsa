package Tree.Easy;
import java.util.*;
public class Qn29 {
    public int diameterOfBinaryTree(TreeNode root) {

        if(root == null)
            return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int lDia = diameterOfBinaryTree(root.left);
        int rDia = diameterOfBinaryTree(root.right);
        return Math.max(
                (leftHeight + rightHeight),
                Math.max(lDia, rDia));
    };

    int height(TreeNode root) {
        int ans = 0;
        if(root == null)
            return ans;

        Queue<TreeNode> Q = new LinkedList<>();
        Q.add(root);

        while(!Q.isEmpty()) {
            int size = Q.size();

            while(size > 0) {
                TreeNode current = Q.poll();
                size--;

                if(current.left != null)
                    Q.add(current.left);
                if(current.right != null)
                    Q.add(current.right);
            }

            ans++;
        }
        return ans;
    }
}
