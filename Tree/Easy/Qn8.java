//N-ary Tree PostOrder Traversal
package Tree.Easy;

import java.util.*;

public class Qn8 {
    public List<Integer> postOrder(Node root) {
        List<Integer> answer = new ArrayList<Integer>();
        postOrder(root, answer);
        //Below is the tweak in iterative approach
        Collections.reverse(answer);
        return answer;
    }

    private void postOrder(Node root, List answer) {
        if (root == null)
            return;

        for (Node child : root.children) {
            postOrder(child, answer);
        }

        int data = root.val;
        answer.add(data);
    }

    private void postOrderUsingStack(Node root, List<Integer> list) {
        if (root == null)
            return;
        Stack<Node> St = new Stack<>();
        St.add(root);

        while (!St.empty()) {
            Node current = St.pop();
            list.add(current.val);

            List<Node> childrens = current.children;
            int n = childrens.size();

            for (int i = 0; i < n; i++) {
                St.push(childrens.get(i));
            }

        }
    }
}
//https://leetcode.com/problems/n-ary-tree-postorder-traversal/