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

        ListNode current = head; 
        boolean hasCycle = false; 

        while(current!=null){
            if(current.val== 999999){
                return !hasCycle; 
            }
            current.val = 999999; 
            current = current.next; 
        }
        return hasCycle;
    }
}