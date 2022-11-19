
#include <stdio.h> 
#include <stdlib.h> 
 
 struct Node{
      int data; 
      struct Node* next; 
 };
 void push(struct Node** head){
    
     struct Node* temp=NULL; 
     temp = (struct Node*)malloc(sizeof(struct Node)); 
     printf("Enter the number you want to push: "); 
     scanf("%d",&temp->data); 
    //  printf("%d", temp->data);
     if(*head==NULL){
         *head = temp; 
     }
     else{
         temp->next =*head; 
         *head = temp; 
     }
    //   printf("%lu", sizeof(temp));
 }
 void insertAfter(struct Node* prev){
     if(prev == NULL){
         printf("Previous Node can't be NULL"); 
     }
     struct Node* temp; 
     temp = (struct Node*)malloc(sizeof(struct Node));
     printf("Enter the number you want to insert after %d:", prev->data); 
     scanf("%d",&temp->data); 
     temp->next = prev->next; 
     prev->next = temp; 
     
 }
 void append(struct Node** head){
     struct Node* temp = NULL; 
     temp = (struct Node*)malloc(sizeof(struct Node)); 
     printf("Enter the number you want to append: "); 
     scanf("%d",&temp->data); 
     temp->next = NULL; 
     
     if(*head==NULL){
         *head = temp;
        return;
     }
     else{
         struct Node* last = *head; 
         while(last->next != NULL){
             last = last->next; 
         }
         last->next = temp; 
     }
 }
 
 void printList(struct Node* head){
     struct Node* n = head; 
     while(n!=NULL){
         printf("%d ", n->data); 
         n = n->next; 
         
     }
     
 }
 int main(){
    //  struct Node* head = NULL; 
     struct Node* head = NULL; 
    struct Node* second = NULL; 
    struct Node* third = NULL; 

    head = (struct Node*)malloc(sizeof(struct Node));
    second = (struct Node*)malloc(sizeof(struct Node)); 
    third = (struct Node*)malloc(sizeof(struct Node)); 

    head->data= 1; 
    head->next = second; 

    second->data = 2; 
    second->next = third; 

    third-> data = 3; 
    third-> next = NULL; 

      append(&head); 
     push(&head);
     push(&head); 
     push(&head);
     append(&head); 
     insertAfter(second->next); 
     printList(head);
     return 0; 
     
 }