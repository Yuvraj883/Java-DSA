#include <stdio.h> 

void push1(int *stack, int size, int *top){
    if(*top == size-1){
        printf("Stack1 is full!!"); 
        return; 
    }
   int val; 
   printf("Enter the value you want to insert to the stack: "); 
   scanf("%d",&val); 
    *top = *top+1; 
    stack[*top] = val; 

}
// void push2(int *stack, int size, int *top){
//     if(*top == size1-1){
//         printf("Stack1 is full!!"); 
//         return; 
//     }
//    int val; 
//    printf("Enter the value you want to insert to the stack: "); 
//    scanf("%d",&val); 
//     *top = *top+1; 
//     stack[*top] = val; 

// }

void pop1(int *stack, int size, int *top){
    if(*top == 100-size-1){
        printf("Stack1 is empty!!");
        return; 
    }
    *top --; 
}

void Display1(int stack[], int top){
    printf("Stack1: "); 
    for(int i=0; i<top; i++){
        printf("%d ",stack[i]);
    }
}

void Display2(int stack[], int size1, int top){
    printf("Stack2: "); 
    for(int i=size1; i<top; i++){
        printf("%d ",stack[i]);
    }
}


int main(){
    int stack[100]; 
    printf("100 values can be stored in this multi-stack.\n"); 
    int size1=50, size2 = 50;
    int top1 = -1; 
    int top2 = size1; 
    push1(stack,size1, &top1); 
    // push1(stack, size2, &top2); 
    Display1(stack, top1); 
    Display2(stack, size1,top2); 

    
}
