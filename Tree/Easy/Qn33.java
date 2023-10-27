//https://leetcode.com/problems/search-in-a-binary-search-tree/
package Tree.Easy;

public class Qn33 {
    public TreeNode searchBST(TreeNode root, int val) {
//         if(root == null)
//             return root;

//         if(root.val == val) {
//             return root;
//         }

//         if(val < root.val) {
//             return searchBST(root.left, val);
//         }

//         else
//             return searchBST(root.right, val);
//     }

        //iterative
        TreeNode current = root;
        while(current != null) {
            if(val == current.val)
                return current;
            else if(val < current.val)
                current = current.left;
            else
                current = current.right;
        }
        return null;
    }
}

/*
At every stage we are having 2 choices and we are choosing 1 out of it, so
TC : O[logn] this is on and average TC, for skewed Binary Tree it will be O[n]
SC : O[n]

*/
