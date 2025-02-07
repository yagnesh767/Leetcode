class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;

        while (prev.next != null && prev.next.next != null) {
            ListNode first = prev.next;
            ListNode second = first.next;

            // Swapping nodes
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // Move prev two steps forward
            prev = first;
        }

        return dummy.next;
    }
}
