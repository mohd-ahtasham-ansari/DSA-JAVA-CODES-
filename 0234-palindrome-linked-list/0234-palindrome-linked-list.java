class Solution {
    public boolean isPalindrome(ListNode head) {

        // ✅ Fix 1: correct edge case
        if (head == null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;

        // Find middle
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode rightHalf = reverse(slow.next);

        // Start comparing
        ListNode leftHalf = head;

        while (rightHalf != null) {
            if (rightHalf.val != leftHalf.val) {
                return false;
            }

            // Move both
            rightHalf = rightHalf.next;
            leftHalf = leftHalf.next;
        }

        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;

        while (temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;
    }
}