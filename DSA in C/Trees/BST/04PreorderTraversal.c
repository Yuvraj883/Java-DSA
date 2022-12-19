#include <stdio.h> 
#include <stdlib.h> 

struct Node{
    int data; 
    struct Node* left, *right; 
};

struct Node* insert(struct Node* root){
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node)); 
    printf("Enter the value you want in tree: "); 
    scanf("%d", &temp->data); 
    temp->right = NULL; 
    temp->left = NULL; 
    if(root == NULL){
        root = temp ; 
        return root; 
    }

    struct Node* parent = NULL;
    struct Node* curr = root; 
    while(curr){
        parent = curr; 
        if(curr->data>temp->data){
            curr = curr->left; 
        }
        else{
            curr = curr->right; 
        }
    }

    if(parent->data>temp->data){
        parent->left = temp; 
    }
    else{
        parent->right = temp; 
    }

    return root;
}

void preorderTraversal(struct Node* n){
    if(n!=NULL){
        
    printf("%d ", n->data); 
    preorderTraversal(n->left); 
    preorderTraversal(n->right); 
        
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
root = insert(root);
root = insert(root);
root = insert(root); 
root = insert(root); 
root = insert(root);
root = insert(root);
root = insert(root);
root = insert(root);
root = insert(root);
root = insert(root);
root = insert(root);

printf("Pre-Order Traversal of tree: ");
preorderTraversal(root);
printf("\nIn-Order Traversal of tree: ");
inorderTraversal(root);


}