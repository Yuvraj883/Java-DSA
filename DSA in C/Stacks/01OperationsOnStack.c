#include <stdio.h> 
#include <stdlib.h>
void push(int *stack, int *top, int size){
   
    if(*top==size-1){
        printf("\nStack overflow!!"); 
    }
    else{
    int val; 
    printf("\nEnter the value you want to add to the stack: "); 
    scanf("%d",&val); 
        *top = *top+1; 
        stack[*top]=val; 
    }
}

void pop(int *top){
    if(*top==-1){
        printf("\nStack underflow!!");
    }    
    else{
        *top = *top-1;
    }

}

void peek(int *top, int *stack){
    printf("\nValue of the top of the stock is %d\n", stack[*top]); 
}


void printStack(int stack[], int size){
    printf("\nStack: ");
    for(int i=size; i>=0; i--){
        printf("%d ",stack[i]);
    }
}

int main(){
    int top = -1; 
    int stack[5];

    int choice; 
    while(1){
        printf("\nOperations supported by the stack:\n 0.Exit \n 1.Push an Element\n 2.Pop an Element \n 3.Peek the element on top\n 4.See Stack\n "); 
        printf("Enter you choice: "); 
        scanf("%d",&choice); 
        switch(choice){
            case 0: exit(0);
            break;
            case 1: push(stack, &top, 5); 
            break;
            case 2: pop(&top); 
            break;
            case 3: peek(&top, stack);
            break;
            default: printf("\nInvalid Input!!"); 
        }

    }

    // push(stack, &top, 5); 
    // push(stack, &top, 5); 
    // push(stack, &top, 5);
    // peek(&top, stack); 
    // pop(&top);
    // peek(&top, stack); 
    // printStack(stack, top);
    return 0; 

}