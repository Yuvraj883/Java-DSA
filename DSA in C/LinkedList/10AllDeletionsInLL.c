#include <stdio.h> 
#include <stdlib.h> 

struct Node{
    int data; 
    struct Node* next;
}; 
void append(struct Node** head){
    struct Node* temp=NULL; 
    temp = (struct Node*)malloc(sizeof(struct Node)); 
    printf("Enter the number you want to append: "); 
    scanf("%d", &temp->data); 
    temp->next = NULL;
    if(*head == NULL){
        *head = temp; 
    }
    else{
        struct Node* last = *head; 
        while(last->next!=NULL){
            // printf("%d",last->data); 
            last = last->next; 
        }
        last->next = temp; 
    }
}
 void insertAtBegin(struct Node** head ){
     struct Node* temp ; 
     temp = (struct Node*)malloc(sizeof(struct Node)); 
     printf("Enter the value you want to add at the beginning: "); 
     scanf("%d",&temp->data); 
     
     if(*head==NULL){
        *head = temp;
     }
     else{
        temp->next = *head; 
        *head = temp; 
         
     }
 }
 
 void insertAfter(struct Node* prev){
     if(prev==NULL){
         printf("The previous value can't be NULL."); 
     }
     struct Node* temp; 
     temp = (struct Node*)malloc(sizeof(struct Node)); 
     printf("Enter the value you want to add after %d: ",prev->data); 
     scanf("%d",&temp->data); 
     temp->next = prev->next; 
     prev->next = temp; 
     
 }
 
 void deleteHead(struct Node** head){
     struct Node* temp = *head; 
      printf("Deleting...%d\n", temp->data);
     *head = temp->next; 
     free(temp); 
 }

void deleteTail(struct Node* head){
    struct Node* last = head; 
    struct Node* secondLast =NULL;
    
    while(last->next!=NULL){
        secondLast = last; 
        last = last->next; 
    }
     printf("Deleting...%d\n", last->data);
    secondLast->next = NULL; 
    free(last);
}

void deleteAfter(struct Node* prev, struct Node** head){
    struct Node* temp= *head;
    // struct Node* prePrev=NULL; //prePrev could be used if we ran the loop till 
        while(temp->next!=prev){  // temp !=prev and then by doing prePrev->next = prev 
        // prePrev = temp; 
        temp = temp->next; 
    }
    printf("Deleting...%d\n", prev->data);
    
    temp->next = prev->next; 
    free(prev);
    
}

void printList(struct Node* n){
            
    while(n!=NULL){

        printf("%d ",n->data); 
        n = n->next; 
    }
}

int main(){
    // struct Node* head = NULL;
     struct Node* head = NULL; 
    struct Node* second = NULL; 
    struct Node* third = NULL; 

    head = (struct Node*)malloc(sizeof(struct Node));
    second = (struct Node*)malloc(sizeof(struct Node)); 
    third = (struct Node*)malloc(sizeof(struct Node)); 

    head->data= 1; 
    head->next = second; 

    second->data = 2; 
    second->next = third; 

    third-> data = 3; 
    third-> next = NULL; 

    // append(&head); 
    append(&head); 
    insertAtBegin(&head);
    insertAfter(head);
     printList(head); 
     printf("\n"); 
    deleteHead(&head);
    deleteTail(head);
    deleteAfter(second,&head);
    printList(head); 
    return 0;
}




// #include <stdio.h> 
// #include <stdlib.h> 

// struct Node{
//     int data; 
//     struct Node* next;
// }; 
// void append(struct Node** head){
//     struct Node* temp=NULL; 
//     temp = (struct Node*)malloc(sizeof(struct Node)); 
//     printf("Enter the number you want to append: "); 
//     scanf("%d", &temp->data); 
//     temp->next = NULL;
//     if(*head == NULL){
//         *head = temp; 
//     }
//     else{
//         struct Node* last = *head; 
//         while(last->next!=NULL){
//             // printf("%d",last->data); 
//             last = last->next; 
//         }
//         last->next = temp; 
//     }
// }
//  void insertAtBegin(struct Node** head ){
//      struct Node* temp ; 
//      temp = (struct Node*)malloc(sizeof(struct Node)); 
//      printf("Enter the value you want to add at the beginning: "); 
//      scanf("%d",&temp->data); 
     
//      if(*head==NULL){
//         *head = temp;
//      }
//      else{
//         temp->next = *head; 
//         *head = temp; 
         
//      }
//  }
 
//  void insertAfter(struct Node* prev){
//      if(prev==NULL){
//          printf("The previous value can't be NULL."); 
//      }
//      struct Node* temp; 
//      temp = (struct Node*)malloc(sizeof(struct Node)); 
//      printf("Enter the value you want to add after %d: ",prev->data); 
//      scanf("%d",&temp->data); 
//      temp->next = prev->next; 
//      prev->next = temp; 
     
//  }
 
//  void deleteHead(struct Node** head){
//      struct Node* temp = *head; 
//       printf("Deleting...%d\n", temp->data);
//      *head = temp->next; 
//      free(temp); 
//  }

// void deleteTail(struct Node* head){
//     struct Node* last = head; 
//     struct Node* secondLast =NULL;
    
//     while(last->next!=NULL){
//         secondLast = last; 
//         last = last->next; 
//     }
//      printf("Deleting...%d\n", last->data);
//     secondLast->next = NULL; 
//     free(last);
// }

// void deleteAfter(struct Node* prev, struct Node** head){
//     struct Node* temp= *head;
//     // struct Node* prePrev=NULL; //prePrev could be used if we ran the loop till 
//         while(temp->next!=prev){  // temp !=prev and then by doing prePrev->next = prev 
//         // prePrev = temp; 
//         temp = temp->next; 
//     }
//     printf("Deleting...%d\n", prev->data);
    
//     temp->next = prev->next; 
//     free(prev);
    
// }

// void deleteAt(struct Node* node, struct Node* head){
//     if(node->next = NULL){
//         printf("List has been emptied. ");
//         free(node);
//     }
//     else{
//         struct Node* temp = head; 
//         while(temp->next!=node){
//             temp = temp->next; 
//         }
//         printf("Deleting...%d", node->data); 
//         temp->next = node->next;
//         free(node);
        
//     }
// }


