#include <stdio.h>
#include <stdlib.h>

struct Node{
int data; 
struct Node* next; 
}; 

void insertInTheMiddle(struct Node* prev_node, int val){

if(prev_node==NULL){
    printf("The given previous node can't be NULL"); 
    return ;
}
    struct Node* new_node = NULL; 
new_node = (struct Node*)malloc(sizeof(struct Node)); 

new_node->data = val; 
new_node->next=prev_node->next; 

prev_node->next= new_node; 


struct Node* temp = NULL; 

}

int main(){
struct Node* head = NULL; 
struct Node* second = NULL; 
struct Node* third = NULL;

head = (struct Node*)malloc(sizeof(struct Node));
second = (struct Node*)malloc(sizeof(struct Node)); 
third = (struct Node*)malloc(sizeof(struct Node)); 

head->data = 1; 
head->next = second; 

second->data = 2; 
second->next = third; 

third->data = 3;
third->next = NULL;

insertInTheMiddle(second, 4); 
// printList(head); 
struct Node* n = head; 
while(n!=NULL){
    printf("%d ",n->data); 
    n=n->next; 
}
return 0; 
}