#include <stdio.h> 
void PrintArray(int arr[], int n){
    for(int i=0; i<n; i++){
        printf("%d ", arr[i]); 
    }
    printf("\n");
}


void insertAtBeginning(int *arr, int *size, int key){

    int n = *size; 
    for(int i=n-1; i>=0; i--){
       arr[i+1]= arr[i]; 
       
    }
    arr[0] = key; 
    *size = *size+1; 
    n = *size;


}

void insertAtEnd(int *arr, int *size, int key){
    arr[*size]=key; 
    *size = *size+1;     
}

void insertInMiddle(int *arr, int *size, int key, int pos){
    for(int i = *size; i>=pos-1; i--){
        arr[i+1] = arr[i];
    }
    arr[pos-1]=key; 
    *size = *size+1;
}


int main(){
    int n; 
    printf("Enter the length of the array: "); 
    scanf("%d", &n); 
    int arr[n+3]; 
        for(int i=0; i<n+3; i++){
        arr[i]=0; 
    }
    printf("Enter the array elements: "); 
    for(int i=0; i<n; i++){
        scanf("%d", &arr[i]); 
    }
    printf("The Array: "); 
    PrintArray(arr, n);
    int key; 
    printf("Enter the number you want to insert at the beginning: "); 
    scanf("%d", &key); 
    insertAtBeginning(arr,&n, key);
    printf("The array after the insertion at the beginning: "); 
    PrintArray(arr, n);
    printf("\n");

    printf("Enter the number you want to insert at the end: "); 
    scanf("%d",&key);
    insertAtEnd(arr, &n, key);
    printf("The array after the insertion at the end: "); 
    PrintArray(arr, n);
    printf("\n");

    int pos ; 
    printf("Enter the position you want to insert at into the array: "); 
    scanf("%d",&pos); 
    printf("Enter the element you want to insert at %d position: ",pos); 
    scanf("%d", &key); 
    insertInMiddle(arr,&n,key, pos); 
    printf("The array after insertion at %d position: ",pos); 
    PrintArray(arr, n);
    printf("\n");
return 0;
}
