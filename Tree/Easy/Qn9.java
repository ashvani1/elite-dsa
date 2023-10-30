//Leaf-Similar Trees
package Tree.Easy;

import java.util.*;

public class Qn9 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        //we will be holding leaf nodes of given trees in 2 different list and then we will compare these values
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        fillTheList(root1, list1);
        fillTheList(root2, list2);

        System.out.println("size of list "+list1);
        System.out.println("size of list2 "+list2);
        if(list1.size() != list2.size())
        {
            return false;
        }
        int n = list1.size();
        for(int i = 0 ; i < n; i++) {
            if(list1.get(i) != list2.get(i)) {
                return false;
            }
        }
        return true;
    }

    void fillTheList(TreeNode root, List<Integer> list) {
        if(root == null)
            return;

        //leaf node
        if(root.left == null && root.right == null)
            list.add(root.val);
        fillTheList(root.left, list);
        fillTheList(root.right, list);
    }
}

/*
https://leetcode.com/problems/leaf-similar-trees/
* */