#include <stdio.h>
#include <stdlib.h>

struct Node{
    int data; 
    struct Node* next; 
}; 

 void insertAtEnd(struct Node** head_ref, int val){
    // struct Node* ptr = NULL; 
    struct Node* last = *head_ref; 

    struct Node* new_node = NULL; 
    new_node = (struct Node*)malloc(sizeof(struct Node)); 

    new_node->data = val; 
    new_node->next = NULL; 

    //Checking if the head is null i.e. Linked List is empty. 
    if(*head_ref == NULL){
        *head_ref = new_node; 
        return; 
    }

    while(last->next!=NULL){
        last = last->next; 
        // printf("%d ", last->data); 
        //  printf("%d ", n->data); 

    }

    last->next = new_node; 
    return; 

}

void printList(struct Node* n){
    while(n!=NULL){
        printf("%d ", n->data); 
        n = n->next; 
    }
}

int main(){
    struct Node* head = NULL; 
    struct Node* second = NULL; 
    
    head = (struct Node*)malloc(sizeof(struct Node)); 
    second = (struct Node*) malloc(sizeof(struct Node)); 
    // printf("%d ", sizeof(struct Node)); 

    head->data = 0; 
    head->next = second;

    second->data = 1; 
    second->next = NULL; 
    
     insertAtEnd(&head, 2);
    printList(head); 

}