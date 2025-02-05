/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        
        // Move first ahead by n+1 steps
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
        
        // Move both first and second until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        
        // Remove nth node from end
        second.next = second.next.next;
        
        return dummy.next;
    }
}
