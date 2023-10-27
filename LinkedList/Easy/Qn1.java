//Reverse linked list
package LinkedList.Easy;

public class Qn1 extends ListNode {
    static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode newNode = new ListNode(head.val);
            newNode.next = prev;
            prev = newNode;
            head = head.next;
        }
        return prev;
    }

    static ListNode reverseListRecursive(ListNode head) {
        return reverseListUtil(head, null);
    }

    static ListNode reverseListUtil(ListNode head, ListNode newHead) {
        if (head == null) {
            return newHead;
        }

        ListNode newNode = new ListNode(head.val);
        newNode.next = newHead;
        return reverseListUtil(head.next, newNode);
    }


    public static void main(String[] args) {
        ListNode head = getList();
        printLinkedList(head);
        head = reverseList(head);
        printLinkedList(head);
    }
}
/*
https://leetcode.com/problems/reverse-linked-list/

 */