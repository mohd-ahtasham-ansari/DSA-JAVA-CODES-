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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if(fast == null && fast.next == null ){return true;}

        while(fast.next != null && fast.next.next != null ){
            slow = slow.next;
            fast = fast.next.next;

        }
        ListNode righthalf=head;
        ListNode lefthalf =reverse(slow.next);

        while(lefthalf != null){
            if(lefthalf.val != righthalf.val){
                return false;
            }
            else
            lefthalf = lefthalf.next;
            righthalf = righthalf.next;
        }
        return true;
    }
    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode temp = head;
        while(temp != null){
            ListNode front = temp.next;
            temp.next=prev;
            prev = temp;
            temp= front;
            
        }
        return prev;
    } 
}