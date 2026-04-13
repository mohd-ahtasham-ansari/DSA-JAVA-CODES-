class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        // Dummy node (important for edge cases)
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode prevGroup = dummy;

        while (true) {
            // Step 1: Check if k nodes exist
            ListNode kth = prevGroup;
            for (int i = 0; i < k; i++) {
                kth = kth.next;
                if (kth == null) return dummy.next;
            }

            // Step 2: Reverse k nodes
            ListNode curr = prevGroup.next;
            ListNode nextGroup = kth.next;

            ListNode prev = nextGroup;

            while (curr != nextGroup) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            // Step 3: Connect with previous part
            ListNode temp = prevGroup.next; // will become end after reverse
            prevGroup.next = kth;
            prevGroup = temp;
        }
    }
}