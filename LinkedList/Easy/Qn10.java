
package LinkedList.Easy;

public class Qn10 {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return head;

        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode prev = dummyNode;
        ListNode cur = head;

        while(cur != null) {
            if(cur.val == val) {
                prev.next = cur.next;
            }
            else {
                prev = cur;
            }
            cur = cur.next;
        }
        return dummyNode.next;
    }
}

