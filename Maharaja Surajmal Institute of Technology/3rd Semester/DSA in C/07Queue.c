#include <stdio.h> 
#include <stdlib.h> 

struct Node{
    int data; 
    struct Node* next; 
}; 

   struct Node* front = NULL; 
   struct Node* rear = NULL; 
  
void enqueue(struct Node** head){
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
    printf("Enter the value you want to add to the queue: "); 
    scanf("%d",&temp->data); 
    printf("%d added to the queue.\n",temp->data); 
    if(front==NULL){
        
        temp->next = NULL; 
        front= temp; 
        rear = temp;
        *head = temp;
    }
    else{
        temp->next = NULL; 
        rear = temp; 
        struct Node* last = *head; 
        while(last->next!=NULL){
            last = last->next;
        }
        last->next = temp; 
    }
}

void dequeue(struct Node** head){
    struct Node* temp = *head ; 
    *head = temp->next; 
    front = *head;
    printf("%d removed from the queue.\n", temp->data); 
    free(temp); 
}

void printQueue(struct Node* head){
    struct Node* n = head; 
    while(n!=NULL){
        printf("%d ",n->data); 
        n= n->next;
    }
    printf("\n");
}

int main(){
    struct Node* head = NULL; 
    int choice; 
    
    while(1){
        printf("Operations supported by the Queue: \n 1.Enqueue \n 2.Dequeue\n 3.Print \n 4.Exit\n"); 
        printf("Enter your choice: "); 
        scanf("%d",&choice); 
        switch(choice){
            case 1: 
            enqueue(&head); 
            break;
            
            case 2: 
            dequeue(&head); 
            break;
            
            case 3: 
            printQueue(head); 
            break; 
            
            case 4: 
            exit(0); 
            break; 
            
            default: 
            printf("Invalid Input.\n"); 
        }
    }
  
    
}