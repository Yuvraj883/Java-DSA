#include <stdio.h> 
#include <stdlib.h> 

struct Node{
    int data ; 
    struct Node* next; 
};


void append(struct Node** head){
    struct Node* temp=NULL; 
    temp = (struct Node*)malloc(sizeof(struct Node)); 
    scanf("%d", &temp->data); 
    temp->next = NULL;
    if(*head == NULL){
        *head = temp; 
    }
    else{
        struct Node* last = *head; 
        while(last->next!=NULL){
            last = last->next; 
        }
        last->next = temp; 
    }
}

void sortList(struct Node** head){
    struct Node* current = *head; 
    struct Node* idx = NULL; //Points one node ahead of the current

    while(current!=NULL){
        idx = current->next; 

        while(idx!=NULL){
            if(current->data>idx->data){
                int temp = current->data; 
                 current->data=idx->data;
                 idx->data = temp;  

            }
            idx = idx->next; 
        }
        current = current->next; 
    }
}

void printList(struct Node* n){
            
    while(n!=NULL){

        printf("%d ",n->data); 
        n = n->next; 
    }
}

int main(){
    struct Node* head = NULL; 
    printf("Enter the length of the list: ");
    int n; 
    scanf("%d",&n);
    printf("Enter the elements of the Linked List: "); 
    for(int i=0; i<n; i++){
        append(&head);
    }
    printf("Linked List: "); 
    printList(head); 
    sortList(&head); 
    printf("\nSorted Linked List: "); 
    printList(head); 

}