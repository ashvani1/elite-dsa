//Merge Two Binary Trees
package Tree.Easy;

import java.util.concurrent.ThreadFactory;

public class Qn10 {
    void print(TreeNode node) {
        if(node == null)
            return;
        System.out.println(node.val);
        print(node.left);
        print(node.right);
    }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
         if (root1 == null && root2 == null)
            return null;

        if (root1 == null)
            return root2;

        if (root2 == null)
            return root1;

        TreeNode root = new TreeNode(root1.val + root2.val);
        root.left = mergeTrees(root1.left, root2.left);
        root.right = mergeTrees(root1.right, root2.right);

        return root;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        node1.right = new TreeNode(2);

        TreeNode node2 = new TreeNode(3);
        node2.left = new TreeNode(4);
        node2.right = new TreeNode(5);
        node2.right.right = new TreeNode(6);

        Qn10 Q10 = new Qn10();
        TreeNode treeNode = Q10.mergeTrees(node1, node2);
        Q10.print(treeNode);

    }
}

/*
https://leetcode.com/problems/merge-two-binary-trees/
run preOrder traversal for both the trees simultaneously

TC => O[m + n]
SC => O[max(m,n)]
* */