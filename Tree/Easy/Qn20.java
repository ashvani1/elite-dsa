//Cousins in Binary Tree
package Tree.Easy;

public class Qn20 {
    //to solve this problem at any point in time we are having parent of current node, level and current node's value
    public boolean isCousins(TreeNode root, int x, int y) {
        int[] levels = {-1, -1};
        int[] parents = {-1, -1};
        findNodes(root, x, y, levels, parents, 0, new TreeNode());

        if (levels[0] == levels[1] && parents[0] != parents[1]) {
            return true;
        }
        return false;
    }

    void findNodes(TreeNode root, int x, int y, int[] levels, int[] parents, int currentLevel, TreeNode currentParent) {
        if (root == null)
            return;

        if (root.val == x) {
            levels[0] = currentLevel;
            parents[0] = currentParent.val;
        }

        if (root.val == y) {
            levels[1] = currentLevel;
            parents[1] = currentParent.val;
        }

        findNodes(root.left, x, y, levels, parents, currentLevel + 1, root);
        findNodes(root.right, x, y, levels, parents, currentLevel + 1, root);
    }
}
/*https://leetcode.com/problems/cousins-in-binary-tree/
cousins : same level, different parent
TC & SC => O[n]
 */