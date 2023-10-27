//Left View of Binary Tree
package Tree.Easy;
import java.util.*;
public class Qn15 {
    ArrayList<Integer> leftView(TreeNode root)
    {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null)
            return list;

        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            //System.out.println("size is "+size);

            for(int i = 0; i < size; i++) {

                TreeNode current = queue.remove();
                if(i == 0) {
                    list.add(current.val);
                }

                if(current.left != null) {
                    queue.add(current.left);
                }

                if(current.right != null) {
                    queue.add(current.right);
                }
            }
        }
        return list;

    }
}

/*https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1#
* */