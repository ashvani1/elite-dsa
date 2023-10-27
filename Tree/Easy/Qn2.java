//Maximum Depth of N-ary Tree
package Tree.Easy;

public class Qn2 {
    public static int maxDepth(Node root) {

        if (root == null)
            return 0;

        int ans = 0;

        for (Node child : root.children) {
            int temp = maxDepth(child);
            ans = Math.max(ans, temp);
        }
        return ans + 1;
    }
}
/*
https://leetcode.com/problems/maximum-depth-of-n-ary-tree/

* */