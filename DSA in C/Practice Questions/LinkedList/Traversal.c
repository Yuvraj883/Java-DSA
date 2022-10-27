#include <stdio> 
struct Node{
    int data ;
    struct Node* next; 
}

void printList(struct Node* n){

}

int main(){
    struct Node* head = NULL; 
    struct Node* second = NULL; 
    struct Node* third = NULL; 

    head = (struct Node*)malloc(sizeof(struct Node));
    second = (struct Node*)malloc(sizeof(struct Node)); 
    third = (struct Node*)malloc(sizeof(struct Node)); 

    head->data= 1; 
    head->next = second; 

    second->data = 2; 
    head->next = third; 

    third-> data = 3; 
    head-> next = NULL; 




    return 0; 
}