#include<stdio.h> 
#include<stdlib.h> 

struct Node{
    int data; 
    struct Node* next; 
}; 

void push(struct Node** top){
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node)); 
    printf("Enter the value you want to insert: "); 
    scanf("%d",&temp->data); 
    printf("%d added to the stack.\n", temp->data); 
    if(top==NULL){
        temp->next = NULL; 
        *top = temp; 
    }
    else{
        temp->next=*top; 
        *top= temp; 
    }
    
}

void pop(struct Node** top){
    struct Node* temp = NULL; 
    temp = *top; 
    *top = temp->next; 
    printf("%d removed from the stack.\n", temp->data); 

    free(temp); 

}

void peek(struct Node* top){
    if(top==NULL){
        printf("Stack is empty.\n"); 
        return;
    }
    printf("%d is on the top of the stack.\n",top->data); 
}


void printStack(struct Node* n){
    if(n==NULL){
        printf("Stack underflow!!\n");
        return;
    }
    printf("Stack: ");
    while(n!=NULL){
        if(n->data != 0){
        printf("%d ", n->data);
        }
        n = n->next; 
    }
        printf("\n");


}


int main(){
    struct Node* top= NULL; 
    int choice; 
    while(1){
        printf("Operations supported by the stack:-\n 1.Push\n 2.Pop\n 3.Peek\n 4.Print \n 5.Exit\n"); 
        printf("Enter your choice: "); 
        scanf("%d", &choice); 
        switch(choice){
            case 1:
            push(&top); 
            break; 
            case 2: 
            pop(&top);
            break; 
            case 3: 
            peek(top);
            break;
            case 4: 
            printStack(top); 
            break;
            case 5:  
            exit(0); 
            break; 
            default: 
            printf("Invalid Input!\n"); 
            break;
        }
    }
    
}