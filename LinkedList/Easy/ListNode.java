package LinkedList.Easy;

import java.util.List;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    static ListNode getList() {
        ListNode list1 = new ListNode(40);
        ListNode list2 = new ListNode(30, list1);
        ListNode list3 = new ListNode(10, list2);
        ListNode list4 = new ListNode(10, list3);
        return list4;
    }

    static void printLinkedList(ListNode head) {
        while(head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println();
    }
}
