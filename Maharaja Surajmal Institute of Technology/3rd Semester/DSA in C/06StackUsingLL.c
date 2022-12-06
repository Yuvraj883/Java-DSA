#include <stdio.h> 
#include <stdlib.h> 

struct Stack{
    int data; 
    struct Stack* next; 
}; 

void push (struct Stack** top){
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
    if(*top ==NULL){
        temp->next = NULL; 
        *top = temp; 
    }
    else{
          temp->next = *top; 
         *top = temp; 
    }
}

void pop(struct Stack **top){
  struct Stack* temp;

 if(*top == NULL){
    printf("Stack underflow!!"); 
 }

  temp = *top; 
  *top = temp->next; 
  free(temp); 

}

void peek(struct Stack* top){
    printf("\nThe value at the top is %d", top->data); 
}

void printStack(struct Stack* n){
    printf("\nStack: "); 
    if(n->next==NULL){
        printf("Stack is empty!"); 
    }
    else{
    while(n->next!=NULL){
      
         printf("%d ",n->data); 
        n = n->next;
    }
    printf("\n"); 
    }
}

int main(){
    struct Stack* top=NULL; 
    top = (struct Stack*)malloc(sizeof(struct Stack)); 
    // printStack(head); 
    
    // int choice; 
    // while(1){
    //     printf("Follwing are the operations that can be performed on the Stack. \n 0.Exit \n 1.Push \n 2.Pop \n 3.Peek \n 4.Print\n");
    //     printf("Enter your choice: "); 
    //     scanf("%d",&choice); 
    //     switch(choice){
    //         case 0: exit(0); 
    //         break; 
    //         case 1: push(&top); 
    //         break; 
    //         case 2: pop(&top); 
    //         break;
    //         case 3: peek(top); 
    //         break; 
    //         case 4: printStack(top); 
    //         break;
    //     }
    // }
    // pop(&top); 
    push(&top); 
    push(&top); 
    push(&top); 
    pop(&top); 
   
    printStack(top); 

}