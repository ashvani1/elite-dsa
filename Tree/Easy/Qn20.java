//Cousins in Binary Tree
package Tree.Easy;
import java.util.*;
class Pair {
    TreeNode node;
    TreeNode parent;

    Pair(TreeNode node, TreeNode parent) {
        this.node = node;
        this.parent = parent;
    }
}
public class Qn20 {
    //to solve this problem at any point in time we are having parent of current node, level and current node's value
        public boolean isCousins(TreeNode root, int x, int y) {
            return DFSSolution(root, x, y);

        }

        /******************************** BFS solution ***********************************/
        boolean BFSSolution(TreeNode root, int x, int y) {
            TreeNode parentOfX = null;
            TreeNode parentOfY = null;

            Queue<Pair> Q = new LinkedList<>();
            Q.add(new Pair(root, new TreeNode(-1)));

            while (!Q.isEmpty()) {
                int currentSize = Q.size();

                for (int i = 0; i < currentSize; i++) {
                    Pair currentPair = Q.remove();
                    TreeNode currentNode = currentPair.node;
                    TreeNode currentParent = currentPair.parent;

                    System.out.println("x " + x);
                    if (currentNode.val == x) {
                        parentOfX = currentParent;
                    }

                    if (currentNode.val == y) {
                        parentOfY = currentParent;
                    }

                    if (currentNode.left != null) {
                        Q.add(new Pair(currentNode.left, currentNode));
                    }

                    if (currentNode.right != null) {
                        Q.add(new Pair(currentNode.right, currentNode));
                    }
                }
                //we are out of for loop, means we are on same level, as we are on same level so we just need to
                // check parents of x and y are equal or not
                if (parentOfX != null && parentOfY != null) {
                    return (parentOfX.val != parentOfY.val);
                }

                //if either of x and y parent populated means, other node parent is on different level so they can't be cousin
                if (parentOfX != null || parentOfY != null) {
                    return false;
                }
            }
            return false;
        }

        /*******************DFS Solution ***************************/

        boolean DFSSolution(TreeNode root, int x, int y) {
            int[] levels = {-1, -1};
            int parents[] = {-1, -1};
            fillLevelsAndParents(levels, parents, root, x, y, 0, new TreeNode());
            if (levels[0] == levels[1] && parents[0] != parents[1])
                return true;

            return false;
        }

        void fillLevelsAndParents(int[] levels, int[] parents, TreeNode root, int x, int y, int currentLevel, TreeNode currentParent) {
            if (root == null)
                return;

            if (root.val == x) {
                levels[0] = currentLevel;
                parents[0] = currentParent.val;
            } else if (root.val == y) {
                levels[1] = currentLevel;
                parents[1] = currentParent.val;
            }

            fillLevelsAndParents(levels, parents, root.left, x, y, currentLevel + 1, root);
            fillLevelsAndParents(levels, parents, root.right, x, y, currentLevel + 1, root);

        }

        /* **********************************************************/
}
/*https://leetcode.com/problems/cousins-in-binary-tree/
cousins : same level, different parent
TC & SC => O[n]
 */