#include <stdio.h>
#include <stdlib.h> 

struct Node{
    int data; 
    struct Node* left, *right; 
}; 

void inorderSearch(struct Node* root, int val){
    if(root == NULL){
        printf("\nElement not found.");
        return; 
    }
    // printf("%d ",root->data);
    if(val<root->data){
        inorderSearch(root->left, val);

    }
    else if(val>root->data){
        inorderSearch(root->right,val); 
    }
    else{
        printf("\nElement found.");
    }
}

void insert(struct Node** root){
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
    printf("Enter the value you want in the tree: "); 
    scanf("%d",&temp->data); 
    temp->left = NULL; 
    temp->right = NULL; 

    if(*root==NULL){
        *root = temp; 
        return; 
    }

    struct Node* parent = *root, *curr = *root ; 
    while(curr){
        parent = curr; 
        if(temp->data>curr->data){
            curr = curr->right; 
        }
        else{
            curr = curr->left;
        }
    }
    if(parent->data> temp->data){
        parent->left = temp; 

    }
    else{
        parent->right = temp; 

    }
    
}

void inorderTraversal(struct Node* n){
    if(n==NULL){
        return; 
    }
    inorderTraversal(n->left); 
    printf("%d ", n->data); 
    inorderTraversal(n->right);
}

int main(){
    struct Node* root = NULL; 
    insert (&root); 
    insert (&root); 
    insert (&root); 
    insert (&root); 
    insert (&root); 
    insert (&root); 
    insert (&root); 
    printf("Tree: "); 
    inorderTraversal(root); 
    inorderSearch(root, 8);
}