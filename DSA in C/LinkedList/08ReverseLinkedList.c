#include <stdio.h> 
#include <stdlib.h> 
struct Node{
    int data; 
    struct Node* next; 
};
static void reverseList(struct Node** head);
void printList(struct Node* n);

static void reverseList(struct Node** head){
   struct Node* curr = *head; 
    struct Node* prev = NULL; 
    struct Node* next; 

    while(curr!=NULL){
        next = curr->next; 
        curr->next = prev ; 

        prev = curr; 
        curr = next; 
    }
    *head = prev; 
}

void printList(struct Node* head){
    struct Node* n = head; 
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
    reverseList(&head); 
    printList(head);
    // struct Node* new_node = reverseList(head);  
    
    return 0;

}