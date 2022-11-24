/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n){
    struct ListNode* dummy = NULL, *fast, *slow; 
     dummy = (struct ListNode*)malloc(sizeof(struct ListNode)); 
     dummy->next = head;
  
   fast = dummy; 
   slow = dummy;

    for(int i=0; i<n; i++){
        fast = fast->next; 
    }   

    while(fast->next!=NULL){
        fast=fast->next; 
        slow = slow->next; 
    }
    slow->next = slow->next->next; 
    return dummy->next; 

}

// void reverseList(struct ListNode** head){
//     struct ListNode* curr = *head; 
//     struct ListNode* prev = NULL; 
//     struct ListNode* next; 

//     while(curr!=NULL){
//         next = curr->next; 
//         curr->next = prev; 

//         prev = curr; 
//         curr = next; 
//     }
//     *head = curr; 
// }

