//N-ary Tree Preorder Traversal
package Tree.Easy;

import java.util.*;

public class Qn4 {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        preOrder(root, list);
        return list;
    }

    private void preOrder(Node root, List list) {
        if (root == null)
            return;

        int data = root.val;
        list.add(data);
        for (Node child : root.children) {
            preOrder(child, list);
        }

    }

    private void preOrderUsingStack(Node root, List list) {
        if (root == null)
            return;

        Stack<Node> St = new Stack<>();
        St.push(root);

        while (!St.empty()) {
            Node currentNode = St.pop();
            list.add(currentNode.val);

            List<Node> children = currentNode.children;
            int n = children.size();
            for (int i = n - 1; i >= 0; i--) {
                St.push(children.get(i));
            }
        }
    }
}
/*
https://leetcode.com/problems/n-ary-tree-preorder-traversal/
* */