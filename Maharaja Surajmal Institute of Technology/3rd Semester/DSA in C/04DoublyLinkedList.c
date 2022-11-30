#include <stdio.h> 
#include <stdlib.h> 

struct Employee{
    int id; 
    char name[20]; 
    struct Employee* prev; 
    struct Employee* next; 
}; 

void push(struct Employee** head){
    struct Employee* e = (struct Employee*)malloc(sizeof(struct Employee)); 
    if(*head==NULL){
        printf("Enter the employee id and name: "); 
       
        scanf("%d",&e->id); 
        scanf("%s",e->name); 
        e->next = NULL; 
        e->prev = NULL; 
    }
    else{
        printf("Enter the employee id and name: "); 
       
        scanf("%d",&e->id); 
        scanf("%s",&e->name); 
        e->prev = NULL; 
        e->next = *head; 

        (*head)->prev = e; 
    }
    *head = e; 


}

void deleteLastNode(struct Employee *head){
    struct Employee *n = head; 
    if(head == NULL){
        return;
    }
    while(n->next!=NULL){
        n = n->next; 
           printf("%d %s", n->id, n->name); 
    }
    // struct Employee* prev = n; 
    // prev->next = NULL; 
    n->prev->next = NULL; 
    printf("%d %s", n->id, n->name); 
}

void printList(struct Employee* n){
    int i=0;
while(n->next!=NULL){    
    i++; 
    printf("%d ",i);
    printf("%d %s \n",n->id,n->name); 
    n=n->next; 

}
}

int main(){
    struct Employee* head=NULL; 
    head = (struct Employee*)malloc(sizeof(struct Employee)); 
    push(&head); 
    push(&head); 
    push(&head); 
    
    printList(head); 
    deleteLastNode(head);
    printList(head); 

}