//Same Tree
package Tree.Easy;

public class Qn17 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;

        if (p != null && q != null) {
            return (
                    (p.val == q.val)
                            && (isSameTree(p.left, q.left))
                            && (isSameTree(p.right, q.right))
            );
        }

        return false;
    }
}

/*
https://leetcode.com/problems/same-tree/
*/