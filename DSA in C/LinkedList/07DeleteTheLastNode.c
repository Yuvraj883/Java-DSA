#include <stdio.h> 
#include <stdlib.h> 

struct Node{
    int data ; 
    struct Node* next; 
}; 

void printList(struct Node* n){
    while(n!=NULL){
        printf("%d ", n->data); 
        n = n->next; 
    }
    printf("\n"); 
}

void deleteLastNode(struct Node* n){
    struct Node* temp=NULL; 
    struct Node* prev=NULL;
    struct Node* head = n; 

    while(n!=NULL){
        if(temp!=NULL){ 
            prev = temp;
            
        }
        temp=n; 
        n = n->next; 
    } 

     int val = temp->data; 

    prev->next = NULL;
     printf("After deleting the last node: "); 
    printList(head); 

    free(n); 
    free(temp); 

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
    printf("List: ");
    printList(head); 
    deleteLastNode(head);
     
    return 0;
}