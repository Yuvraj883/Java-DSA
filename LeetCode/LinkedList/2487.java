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
    public ListNode removeNodes(ListNode head) {

        Stack <Integer> st = new Stack<>(); 
        ListNode rev = reverse(head); 

        ListNode current = rev; 

        while(current!=null){
            if(st.isEmpty() || (!st.isEmpty() && st.peek()<=current.val)){
                st.push(current.val); 
            }
            current = current.next; 

        }

        // System.out.println(st);
        ListNode ans = new ListNode(); 
        ListNode curr = ans;
        while(!st.isEmpty()){
            curr.next = new ListNode(st.pop()); 
            // System.out.print("Added "+curr.val);

            curr = curr.next;
        }

        return ans.next;

        
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null; 
        ListNode current = head; 
        ListNode next = null; 

        while(current!=null){
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        }
       return prev; 


    }
}