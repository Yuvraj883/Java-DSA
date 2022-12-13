#include<stdio.h> 
#include<stdlib.h> 

struct Node{
    int data; 
    struct Node* left, *right; 
}; 

void insert(struct Node** root){
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node)); 
    printf("Enter the value you want to add to the BST: "); 
    scanf("%d",&temp->data);
  
    temp->left = NULL; 
    temp->right = NULL; 
     struct Node* parent = *root; 
    if(*root == NULL){
        *root = temp; 
        parent = temp;
        printf("%d added to the tree as the root element.\n",parent->data); 
    }
    else{
        struct Node*  curr; 
       
        curr = *root; 
        while(curr){
            parent = curr; 
            if(curr->data > temp->data){
                curr = curr->left; 
            }
            else{
                curr = curr->right; 
            }
        }
        if(parent->data>temp->data){
            parent->left=temp; 
             printf("%d added to the left of %d in BST.\n", parent->left->data, parent->data);
        }
        else{
            parent->right=temp; 
             printf("%d added to the right of %d in the BST.\n", parent->right->data, parent->data); 
        }
       
        
        free(temp); 
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
    insert(&root); 
    insert(&root); 
    // insert(&root);
    // insert(&root); 
    // insert(&root); 
    // insert(&root); 
    printf("Inorder traversal: "); 
    inorderTraversal(root); 
}