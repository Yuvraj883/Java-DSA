#include <stdio.h> 
struct Node{
    int data; 
    struct Node* next; 
};
Node* reverseList(Node* &head);
printList(Node* head);

Node* reverseList(&head){
    Node* curr = head; 
    Node* prev = NULL; 
    Node* next; 

    while(curr!=NULL){
        next = curr->next; 
        curr->next = prev ; 

        prev = curr; 
        curr = next; 
    }
}

void printList(Node* n){
    while(n!=NULL){
        printf("%d ",n->data); 
        n = n->next; 
    }
}

int main(){
    struct Node* head = NULL; 
    struct Node* second = NULL; 
    struct Node* third = NULL; 

    head = (struct Node*)malloc(sizeof(struct Node)); 
    second = (struct Node*)malloc(sizeof(struct Node)); 
    third = (struct Node*)malloc(sizeof(struct Node)); 

    head->data = 1; 
    head->next = second; 

    second->data = 2; 
    second->next = third;

    third->data = 3; 
    third->next = NULL;

    printf("List before reversal: "); 
    printList(head); 
    printf("\n List after reversal: "); 
    reverseList(head); 
    printList(head); 
    
    return 0;

}