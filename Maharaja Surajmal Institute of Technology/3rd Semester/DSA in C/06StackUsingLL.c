#include <stdio.h> 
#include <stdlib.h> 

struct Stack{
    int data; 
    struct Stack* next; 
}; 

void push (struct Stack** head){
    struct Stack* temp = (struct Stack*)malloc(sizeof(struct Stack)); 
    if(temp==NULL){
        //There's is no space left in the memory itself.
        printf("Stack Overflow!!"); 
        return;
    }
    else{
    printf("\nEnter the value you want to insert to the stack: "); 
    scanf("%d",&temp->data); 
    }
    if(*head ==NULL){
        temp->next = NULL; 
        *head = temp; 
    }
    else{
          temp->next = *head; 
         *head = temp; 
    }
}

void pop(struct Stack **head){
    if(*head==NULL){
        printf("\nStack Underflow!!\n"); 
        return; 
    }

    struct Stack* temp=*head;
   
    temp = temp->next;
    *head = temp; 
    free(temp); 

  
}

void peek(struct Stack* head){
    printf("\nThe value at the top is %d", head->data); 
}

void printStack(struct Stack* n){
    printf("\nStack: "); 
    if(n==NULL){
        printf("Stack is empty!"); 
    }
    else{
    while(n!=NULL){
        // if(n->data==0){
        //     n=n->next;
        // }
        // else{
        // printf("%d ",n->data); 
        // n = n->next;
        // }
         printf("%d ",n->data); 
        n = n->next;
    }
    }
}

int main(){
    struct Stack* head=NULL; 
    head = (struct Stack*)malloc(sizeof(struct Stack)); 
    // printStack(head); 

    push(&head); 
    push(&head); 

    push(&head); 
    push(&head); 
    push(&head); 


    push(&head); 
    // peek(head); 
    printStack(head); 
    pop(&head); 
    printStack(head); 

}