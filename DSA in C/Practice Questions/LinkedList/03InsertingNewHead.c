#include<stdio.h>
#include <stdlib.h> 

struct Node{
    int data; 
    struct Node* next; 

}; 
void push(struct Node** head_ref, int new_data){
    struct Node* new_node = NULL; 
    new_node = (struct Node*)malloc(sizeof(struct Node)); 
     
     new_node->data = new_data; 
     new_node-> next = *head_ref; 
    *head_ref= new_node; 

}

void printList(struct Node* n){
    while (n != NULL){
        printf(" %d ", n->data); 
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
    head->next= second; 
     
    second->data = 2; 
    second -> next = third; 
    
    third->data = 3; 
    third->next = NULL; 

    push(&head, 0); 
    printList(head); 

}