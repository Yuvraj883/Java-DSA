#include<stdio.h> 

void printArray(int arr[], int n){
    for(int i =0; i<n; i++){
        printf("%d ", arr[i]); 
    }
}

void insertionSort(int arr[], int n){
    for(int i=1; i<n; i++){
        int key = arr[i]; 
        int j=i-1; 
        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j]; 
            j = j-1; 
        }
        arr[j+1]=key; 
    }
}


int main(){
    int n; 
    printf("Enter the size of the array: "); 
    scanf("%d",&n); 
    int arr[n]; 
    printf("Enter the array elements: "); 
    for(int i=0; i<n; i++){
        scanf("%d",&arr[i]); 
    }
    printf("Array: "); 
    printArray(arr, n); 
    printf("\nSorted Array: "); 
    insertionSort(arr, n); 
    printArray(arr, n); 
}