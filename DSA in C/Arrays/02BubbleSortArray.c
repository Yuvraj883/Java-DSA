#include <stdio.h> 

void printArray(int arr[], int n){
    for(int i =0; i<n; i++){
        printf("%d ", arr[i]); 
    }
}

void bubbleSort(int arr[], int n){
    for(int i=0; i<n; i++){
        for(int j=0; j<n-i-1; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j]; 
                arr[j] = arr[j+1]; 
                arr[j+1] = temp; 
            }
        }
    }
}

int main(){
    int n; 
    printf("Enter the length of the array: "); 
    scanf("%d",&n); 

    int arr[n]; 
    printf("Enter the array elements: "); 
    for(int i=0; i<n; i++){
        scanf("%d",&arr[i]); 
    }

    printf("Array: "); 
    printArray(arr, n); 
    printf("\nSorted Array: "); 
    bubbleSort(arr,n); 
    printArray(arr, n);

}