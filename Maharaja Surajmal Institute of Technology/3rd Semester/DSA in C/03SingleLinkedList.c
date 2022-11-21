#include<stdio.h> 
#include<stdlib.h> 

struct Student{
    int roll; 
    char name[20]; 
    struct Student* next; 
}; 
void append(struct Student** s1, int n){
    struct Student* s = NULL; 
    s = (struct Student*)malloc(sizeof(struct Student)); 
    printf("Enter the roll no. of the student %d: ",n); 
    scanf("%d", &s->roll); 
    printf("Enter the name of the student %d: ", n); 
    scanf("%s", s->name); 
    // fgets(s->name, 20, stdin); 
    s->next = NULL; 
    if(*s1==NULL){
        *s1 = s; 
    }
    else{
        struct Student* last  = *s1; 
        while(last->next!=NULL){
            last = last->next; 
        }
        last->next = s; 
    }
    
}

void deleteRoll(struct Student** s1, int roll){
   struct Student* s = *s1, *prev; 
   if(s!=NULL && roll == s->roll){
       *s1 = s->next; 
       free(s); 
   }
   else{
       while(s!=NULL && s->roll != roll){
           prev = s; 
           s = s->next; 
       }
       if(s==NULL){
           printf("There is no student with roll no. %d in the list. ",roll); 
           
       }
       else{
           prev->next= s->next; 
           free(s); 
       }
   }
}

void reverseList(struct Student** s1){
   struct Student* curr = *s1; 
    struct Student* prev = NULL; 
    struct Student* next; 

    while(curr!=NULL){
        next = curr->next; 
        curr->next = prev ; 

        prev = curr; 
        curr = next; 
    }
    *s1= prev; 
}

void printList(struct Student* s){
    while(s!=NULL){
        printf("%d %s",s->roll, s->name); 
        printf("\n"); 
        s= s->next; 
    }
}

int main(){
    struct Student* s1 = NULL; 
    int n; 
    printf("Enter the number of students you want to add: "); 
    scanf("%d", &n); 
    for(int i =0; i<n; i++){
        append(&s1, i+1) ;
    }
    printf("List:\n ");
    printList(s1); 
    
    
    deleteRoll(&s1, 2); 
    printf("\nList after deleting 2nd Student: \n"); 

    printList(s1);
    reverseList(&s1); 
    printf("\nReversed List: \n"); 
    printList(s1); 
    return 0; 
}