class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int count = 0;

        // Check if there are at least k nodes to reverse
        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }

        if (count < k) return head; // If less than k nodes remain, return as is

        // Reverse first k nodes
        ListNode prev = null, next;
        curr = head;
        for (int i = 0; i < k; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Recursively process the remaining nodes
        head.next = reverseKGroup(curr, k);

        return prev; // New head after reversal
    }
}
