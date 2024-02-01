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

       ListNode current = head;
       printList(head);


       ListNode fp = head; 
       ListNode sp = head; 
       while(fp!=null && fp.next != null){
           sp = sp.next; 
           fp = fp.next.next;
           
       }
       ListNode reverse =  reverse(sp); 
       System.out.println();
       printList(reverse);



       while(reverse!=null){
           if(current.val != reverse.val){
               return false;
           }
           current = current.next;
           reverse = reverse.next;
       }

        return true;
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

    public void printList(ListNode head){
        ListNode current  = head; 
        while(current!=null){
            System.out.print(" "+current.val);
            current = current.next;
        }
    }
}