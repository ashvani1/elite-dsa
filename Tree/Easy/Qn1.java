//Maximum Depth of Binary Tree [Height]
package Tree.Easy;
import java.util.*;

public class Qn1 {
    public int maxDepth(TreeNode root) {
        //using iterative approach
        int height = 0;
        if(root == null)
            return height;

        Queue<TreeNode> Q = new LinkedList<>();
        Q.add(root);

        while(!Q.isEmpty()) {
            int currentSize = Q.size();

            while(currentSize > 0) {
                TreeNode currentNode = Q.remove();
                currentSize--;

                if(currentNode.left != null)
                    Q.add(currentNode.left);

                if(currentNode.right != null)
                    Q.add(currentNode.right);
            }

            //when the size of current level becomes 0, increase height
            height++;
        }
        return height;

    }


    public int maxDepthUsingRecursion(TreeNode root) {
        if(root == null)
        {
            return 0;
        }

        int leftHeight = maxDepthUsingRecursion(root.left) + 1;
        int rightHeight = maxDepthUsingRecursion(root.right) + 1;
        return Math.max(leftHeight, rightHeight);

    }
}

/*
https://leetcode.com/problems/maximum-depth-of-binary-tree/
The height or maximum depth of a binary tree is the total number of edges on the longest path from the root node to the leaf node.

for recursive approach
TC => O[n] : where n is number of nodes and as we are visiting every node only once so TC will be O[n]
SC => O[h] : where h is the height of tree, our recursive stack will be holding nodes from largest branch, in worst case
it will be O[n]
* */