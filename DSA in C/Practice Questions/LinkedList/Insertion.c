#include <stdio> 
struct Node{
    int data 
    struct Node* next; 
}

int main(){
    struct Node* head = NULL; 
    struct Node* second = NULL; 
    struct Node* third = NULL; 

//Memory allocation in the heap for the three variables.
    head = (struct Node*)malloc(sizeof(struct Node));
    second = (struct Node*)malloc(sizeof(struct Node)); 
    third = (struct Node*)malloc(sizeof(struct Node)); 

//Assigning values to the variables. 
    head->data= 1; 
    head->next = second; 

    second->data = 2; 
    head->next = third; 

    third-> data = 3; 
    head-> next = NULL; 




    return 0; 
}