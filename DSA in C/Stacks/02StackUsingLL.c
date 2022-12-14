#include <stdio.h> 
#include <malloc.h>

struct Stack{
    int data; 
    struct Stack* next; 
};

void push(struct Stack** top){
    struct Stack* temp = (struct Stack*)malloc(sizeof(struct Stack)); 
    printf("Enter the value you want in the stack: "); 
    scanf("%d",&temp->data); 
    
    if(*top == NULL){
        *top = temp; 
        temp->next = NULL;
        printf("%d added to the stack.\n", temp->data);
    }
    else{
      temp->next = *top; 
      *top = temp; 
      printf("%d added to the stack.\n", temp->data);

    }
}

void pop(struct Stack** top){
    if(*top==NULL){
        printf("Stack Underflow!!\n"); 
        return;
    }
    struct Stack* temp = *top; 
    temp = temp->next; 
    *top = temp; 
    printf("%d popped from the memory!!\n");
    // free(temp);
}

void peek(struct Stack* top){
    printf("%d is at the top of the stack.\n", top->data); 
}

void printStack(struct Stack* n){
    printf("Stack: ");

    if(n==NULL){
        printf("Stack is empty!!\n");
        return;
    }

    while(n!=NULL){
        printf("%d ",n->data); 
        n = n->next;
    }
    printf("\n");
    
}

void main(){
    struct Stack* top = NULL; 
    int choice; 
    while(1){
        printf("The operations supported by the stack:\n 1.Push \n 2.Pop \n 3.Peek \n 4. Print \n 5.Exit\n");
        printf("Enter your choice: "); 
        scanf("%d",&choice); 
        switch(choice){
            case 1: push(&top); 
            break; 
            case 2: pop(&top); 
            break;
            case 3: peek(top); 
            break; 
            case 4: printStack(top); 
            break; 
            case 5: exit(0); 
            break; 
            default: 
            printf("Invalid Input."); 
        }
        
    }
}