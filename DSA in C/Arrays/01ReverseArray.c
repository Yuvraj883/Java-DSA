#include <stdio.h> 

int reverseArray(int arr[], int n){
    for(int i =0; i<n/2; i++){
        int temp = arr[i]; 
        arr[i]= arr[n-i-1] ;
        arr[n-i-1] = temp; 
    }

     printf("Reversed Array: "); 
    for(int i=0; i<n; i++){
        printf("%d ", arr[i]); 
    }
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
    for(int i=0; i<n; i++){
        printf("%d ", arr[i]); 
    }
    printf("\n"); 
    reverseArray(arr, n); 

}