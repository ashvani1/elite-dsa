package LinkedList.Easy;

public class Qn3 {
    public int getDecimalValue(ListNode head) {
        int length = findLength(head);

        int result = 0;
        int pow = length -1;
        int base = 2;
        while(head != null) {
            result = result + (int) (head.val * Math.pow(base, pow));
            pow--;
            head = head.next;
        }
        return result;

    }

    int findLength(ListNode head) {
        ListNode current = head;
        int length = 0;
        while(current != null) {
            length++;
            current = current.next;
        }
        return length;
    }
}
