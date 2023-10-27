//Palindrome Linked List
package LinkedList.Easy;
import java.util.Stack;

public class Qn8 {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode current = head;
        while (current != null) {
            stack.add(current);
            current = current.next;
        }
        current = head;
        while (!stack.isEmpty()) {
            if (stack.pop().val != current.val)
                return false;
            current = current.next;
        }
        return true;
    }
}

/*https://leetcode.com/problems/palindrome-linked-list
Input: head = [1,2,2,1]
Output: true
* */