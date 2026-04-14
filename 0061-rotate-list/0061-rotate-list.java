class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // Step 1: find length
        ListNode temp = head;
        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        // Step 2: make circular
        temp.next = head;

        // Step 3: effective rotation
        k = k % length;

        // Step 4: find new tail
        int steps = length - k;
        ListNode newTail = temp;
        while (steps-- > 0) {
            newTail = newTail.next;
        }

        // Step 5: break circle
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}