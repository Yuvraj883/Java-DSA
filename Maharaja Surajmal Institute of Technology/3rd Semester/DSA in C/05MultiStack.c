#include <stdio.h> 

void push1(int *stack, int size, int *top){
    if(*top == size-1){
        printf("Stack1 is full!!"); 
        return; 
    }
   int val; 
   printf("Enter the value you want to insert to the stack1: "); 
   scanf("%d",&val); 
    *top = *top+1; 
    stack[*top] = val; 

}
void push2(int *stack, int size, int *top){
    if(*top>99){
        printf("Stack2 is full!!"); 
        return; 
    }
   int val; 
   printf("Enter the value you want to insert to the stack2: "); 
   scanf("%d",&val); 
    *top = *top+1; 
    stack[*top] = val; 

}

void pop1(int *stack, int *top){
if(*top==-1){
    printf("Stack1 is empty!!\n");
    return; 
}
*top=*top-1; 
if(*top==-1){
    printf("Stack1 has been emptied!!\n");
    return; 
}
}

void pop2(int *stack, int size, int *top){
    if(*top == size-1){
        printf("Stack2 is empty!!\n");
        return; 
    }
    *top=*top-1; 
     if(*top == size-1){
        printf("Stack2 has been emptied!!\n");
        return; 
    }
}

void peek1(int stack[], int top){
    printf("%d is at the top of Stack1.\n",stack[top]); 
}

void peek2(int stack[], int top){
    printf("%d is at the top of Stack2.\n",stack[top]); 

}

void Display1(int stack[], int top){
    if(top==-1){
        return;
    }
    printf("Stack1: "); 
    for(int i=top; i>=0; i--){
        printf("%d ",stack[i]);
    }
    printf("\n"); 

}

void Display2(int stack[], int size, int top){
    if(top<=100-size-1){
        return;
    }
    printf("Stack2: "); 
    for(int i=top; i>size-1; i--){
        printf("%d ",stack[i]);
    }
    printf("\n"); 
}


int main(){
    int stack[100]; 
    printf("100 values can be stored in this multi-stack.\n"); 
    int size1=50, size2 = 50;
    int top1 = -1; 
    int top2 = size1-1; 
    push1(stack,size1, &top1); 
    push2(stack, size2, &top2); 
    push2(stack, size2, &top2); 
    peek1(stack, top1); 
    peek2(stack,top2);
    pop1(stack, &top1); 

    pop2(stack,size2, &top2); 
        
    Display1(stack, top1); 
    Display2(stack, size2,top2); 

    
}
