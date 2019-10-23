// Problem #19

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        
        int size = 0; 
        ListNode sizecurrent = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy ;
        
        
        while(sizecurrent!=null){
            
            size++;
            sizecurrent = sizecurrent.next;
            
        }
        
        
        
        for(int i=0; i<size-n; i++){
            
            current = current.next;
        }
        
        current.next = current.next.next; 
        
        return dummy.next; // since we could have deleted the head 
   
        
    }
}