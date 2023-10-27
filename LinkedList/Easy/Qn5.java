//Remove Duplicates from Sorted List
package LinkedList.Easy;

public class Qn5 extends ListNode{
    static ListNode current = null;

    static ListNode deleteDuplicates(ListNode head) {
        current = head;
        while (current != null) {
            ListNode temp = current;
            while (temp != null && temp.val == current.val) {
                temp = temp.next;
            }
            current.next = temp;
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = getList();
        ListNode result = deleteDuplicates(head);
        printLinkedList(result);
    }
}

/*
https://leetcode.com/problems/remove-duplicates-from-sorted-list/
* */
