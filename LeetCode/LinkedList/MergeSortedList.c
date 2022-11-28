/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2){
struct ListNode* dummy = NULL; 
 dummy = (struct ListNode*)malloc(sizeof(struct ListNode)); 
 struct ListNode* l = dummy; 
struct ListNode* l1 = list1; 
struct ListNode* l2 = list2; 
if(list1 == NULL){
    return list2; 
}
else if(list2 == NULL){
    return list1; 
}
// if(l1->val <=l2->val){
//     dummy->next = l1; 
//     l1 = l1->next; 
// }
// else{
//     dummy->next = l2; 
//     l2 = l2->next; 
// }

while(l1!=NULL && l2!=NULL){
    if(l1->val<=l2->val){
        l->next = l1;
         l1 = l1->next;
    }
    else{
        l->next = l2; 
        l2 = l2->next; 
    }
    l = l->next; 
}

while(l1!=NULL){
    l->next = l1; 
    l1 = l1->next; 
    l = l->next;
}

while(l2!=NULL){
    l->next = l2; 
    l2 = l2->next; 
    l = l->next;
}
 return dummy->next; 
}