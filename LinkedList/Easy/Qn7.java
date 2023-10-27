//Linked List Cycle
package LinkedList.Easy;

public class Qn7 {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow)
                return true;
        }
        return false;
    }
}

/*
https://leetcode.com/problems/linked-list-cycle/
TC => O[n]
SC => O[1]
* */