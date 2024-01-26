class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode();
        ListNode l3 = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int v1 = (l1 != null) ? l1.val : 0;
            int v2 = (l2 != null) ? l2.val : 0;

            int sum = v1 + v2 + carry;
            carry = sum / 10;
            l3.next = new ListNode(sum % 10);
            
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
            l3 = l3.next;
        }

        return dummyHead.next;
    }
}
