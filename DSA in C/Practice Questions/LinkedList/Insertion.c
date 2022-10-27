#include <stdio.h>
#include <stdlib.h> 
struct Node{
    int data 
    struct Node* next; 
};

int main(){
    struct Node* head = NULL; 
    struct Node* second = NULL; 
    struct Node* third = NULL; 

//Memory allocation in the heap for the three variables.
    head = (struct Node*)malloc(sizeof(struct Node));
    second = (struct Node*)malloc(sizeof(struct Node)); 
    third = (struct Node*)malloc(sizeof(struct Node)); 

//Assigning values to the variables. 
    head->data= 1; //Assigning data to the head node
    head->next = second; // Linking the head node to the second node

    second->data = 2; 
    head->next = third; 

    third-> data = 3; 
    head-> next = NULL; 




    return 0; 
}