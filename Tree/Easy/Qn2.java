//Maximum Depth of N-ary Tree
package Tree.Easy;

public class Qn2 {
    public int maxDepth(Node root) {
        int height = 0;
        if(root == null)
            return 0;

        int n = root.children.size();
        for(int i = 0; i < n; i++) {
            height = Math.max(height,maxDepth(root.children.get(i)));

        }

        /*for(Node currentChild : root.children) {
            height = Math.max(height, maxDepth(currentChild));}*/

        return height + 1;
    }
}
/*
https://leetcode.com/problems/maximum-depth-of-n-ary-tree/

* */