//Top View of Binary Tree
package Tree.Easy;

import java.util.*;

public class Qn25 {
    static class QueueObject {
        TreeNode node;
        int hd1;

        QueueObject(TreeNode node, int hd1) {
            this.node = node;
            this.hd1 = hd1;
        }
    }

    static void verticalOrder(TreeNode root) {
        Queue<QueueObject> Q = new LinkedList<>();
        TreeMap<Integer, ArrayList<TreeNode>> map = new TreeMap<>();

        if (root == null)
            return;

        Q.add(new QueueObject(root, 0));
        while (!Q.isEmpty()) {
            QueueObject currentObject = Q.remove();
            if (map.containsKey(currentObject.hd1)) {
                ArrayList<TreeNode> currentList = map.get(currentObject.hd1);
                currentList.add(currentObject.node);
                map.put(currentObject.hd1, currentList);
            } else {
                ArrayList<TreeNode> newList = new ArrayList<>();
                newList.add(currentObject.node);
                map.put(currentObject.hd1, newList);
            }
            if (currentObject.node.left != null) {
                Q.add(new QueueObject(currentObject.node.left, currentObject.hd1 - 1));
            }
            if (currentObject.node.right != null) {
                Q.add(new QueueObject(currentObject.node.right, currentObject.hd1 + 1));
            }

        }

        for (Map.Entry<Integer, ArrayList<TreeNode>> entry : map.entrySet()) {
            ArrayList<TreeNode> l = entry.getValue();
            for (TreeNode i : l) {
                System.out.print(i.val + " ");
            }
            //	System.out.println();
        }
    }
}
//https://practice.geeksforgeeks.org/problems/print-a-binary-tree-in-vertical-order/1