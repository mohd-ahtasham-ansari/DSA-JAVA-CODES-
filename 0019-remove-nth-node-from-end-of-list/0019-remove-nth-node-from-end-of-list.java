class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int count = 0;
        ListNode temp = head;
        
        // Step 1: count nodes
        while(temp != null){
            count++;
            temp = temp.next;
        }
        
        // Step 2: delete head case
        if(count == n){
            return head.next;
        }
        
        // Step 3: go to previous node
        temp = head;
        for(int i = 0; i < count - n - 1; i++){
            temp = temp.next;
        }
        
        // Step 4: delete node
        temp.next = temp.next.next;
        
        return head;
    }
}