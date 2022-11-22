#include <stdio.h> 

void printArray(int arr[], int n){
     for(int i=0; i<n; i++){
        printf("%d ", arr[i]); 
    }
}
int reverseArray(int arr[], int n){
    for(int i =0; i<n/2; i++){
        int temp = arr[i]; 
        arr[i]= arr[n-i-1] ;
        arr[n-i-1] = temp; 
    }

     printf("Reversed Array: "); 
     printArray(arr,n);

}


int main(){
    int n; 
    printf("Enter the size of the array: "); 
    scanf("%d",&n); 

    int arr[n];
    printf("Enter the array elements: "); 
    for(int i=0; i<n; i++){
        scanf("%d", &arr[i]); 
    } 
    
    printf("Array: "); 
    printArray(arr,n); 
    printf("\n"); 
    reverseArray(arr, n); 

}