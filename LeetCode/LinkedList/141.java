/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       
        ListNode fast = head; 
        ListNode slow = head; 
        ListNode current = head; 

        while(fast!=null && fast.next!=null){
         
            slow = slow.next; 
            fast = fast.next.next;

            if(slow == fast){
                return true; 
            } 
        }

        return false; 






        // ListNode current = head; 
        // boolean hasCycle = false; 

        // while(current!=null){
        //     if(current.val== 999999){
        //         return !hasCycle; 
        //     }
        //     current.val = 999999; 
        //     current = current.next; 
        // }
        // return hasCycle;
    }
}