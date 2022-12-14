#include <stdio.h> 
#include <stdlib.h> 

void enqueue(int *queue, int *rear, int *front){

    if(*rear<10-1){
    *rear=*rear+1; 
    printf("Enter the value you want to add in the queue: "); 
    scanf("%d",&queue[*rear]); 
    printf("%d added to the queue.\n", queue[*rear]);
    
     if(*front == -1){
        *front = 0;
    }
    
    }
    else{
        printf("Queue is full!!"); 
    }
}

void dequeue(int *queue, int *front, int *rear){
    if(*front==-1 || *front>*rear){
        printf("Queue underflow.\n"); 
    }
    *front = *front+1;
    printf("%d removed from the queue.\n",queue[*front-1] ); 
}

void printQueue(int queue[], int rear, int front){
    printf("Queue: "); 
    if(front==-1 || front>rear){
        printf("Queue underflow.");
    }
    for(int i=front; i<=rear; i++){
        printf("%d ",queue[i]);
    }
    printf("\n");
}

void main(){
    int queue[10]; 
    int rear = -1; 
    int front = -1;
   
   int choice; 
   printf("Welcome to the Queue. This queue can currently hold only 10 elements.\n"); 
   printf("Operations supported by the Queue:\n 1.Enqueue\n 2.Dequeue \n 3.Print \n 4.Exit\n"); 
   while(1){
       printf("Enter your choice: "); 
       scanf("%d",&choice); 
       switch(choice){
           case 1: enqueue(queue, &rear, &front); 
           break;
           case 2: dequeue(queue, &front, &rear); 
           break; 
           case 3: printQueue(queue, rear, front); 
           break; 
           case 4: exit(0);
           break;
           default: printf("Invalid Input!!\n"); 
                    
       }
   }


}