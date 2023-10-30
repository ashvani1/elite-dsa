//Binary Tree Inorder Traversal
package Tree.Easy;
import java.util.*;
public class Qn5 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        return list;
    }

    private void inOrder(TreeNode root, List list) {
        if (root == null)
            return;

        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);

    }
    public List<Integer> inorderTraversalUsingStack(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> St = new Stack<>();

        if(root == null)
            return list;

        //we have to iterate complete left subtree until left becomes null for current node
        addLeftSubtreeToStack(root, St);

        //once we have processed left subtree
        while(!St.isEmpty()) {
            TreeNode currentNode = St.pop();
            System.out.println("adding currentNode to list "+currentNode.val);
            list.add(currentNode.val);

            //now we have to traverse all left subtree of right of currentNode
            if(currentNode.right != null) {
                addLeftSubtreeToStack(currentNode.right, St);
            }
        }
        return list;
    }


    void addLeftSubtreeToStack(TreeNode currentNode, Stack<TreeNode> S) {
        S.push(currentNode);

        while(currentNode.left != null) {
            S.push(currentNode.left);
            currentNode = currentNode.left;
        }
    }
}
/*
https://leetcode.com/problems/binary-tree-inorder-traversal/
whichever node is coming second time in traversal [root -> left -> right]
* */