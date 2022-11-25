/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2){
    struct ListNode* dummy = (struct ListNode*)malloc(sizeof(struct ListNode)); 
    
   if(list1->val=<list2->val){
       dummy->next = list1; 
       list1= list1->next; 
   }
   else{
       dummy->next = list2; 
       list2 = list->next; 
   }
   
    while(list1->next!=NULL && list2->next!=NULL){
        if(list1->val<list2->val){
        
        }
    }

}