//Merge Two Sorted Lists
package LinkedList.Easy;

public class Qn4 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;

        if (list2 == null)
            return list1;

        ListNode dummyNode = new ListNode(-1);
        ListNode head = dummyNode;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                dummyNode.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                dummyNode.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            dummyNode = dummyNode.next;
        }
        if (list1 != null) {
            dummyNode.next = list1;
        } else if (list2 != null) {
            dummyNode.next = list2;
        }
        return head.next;
    }
}

/*
 * https://leetcode.com/problems/merge-two-sorted-lists
 */
