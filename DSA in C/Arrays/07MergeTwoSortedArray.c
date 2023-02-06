#include<stdio.h> 

void printArray(int arr[], int size){
    for(int i=0; i<size; i++){
        printf("%d ", arr[i]); 
    }
    printf("\n"); 
}

void mergeArrays(int arr1[], int arr2[],  int n, int m){
    int arr[n+m]; 
    int i = 0; 
    int j = 0; 
    int k = 0; 
    while(i<n && j<m && k<n+m){
        if(arr1[i]<=arr2[j]){
            arr[k]=arr1[i]; 
            i++; 
            k++; 
        }
        else if(arr1[i]>arr2[j]){
            arr[k]=arr2[j]; 
            k++; 
            j++; 
        }
    }

    while(i<n){
        arr[k]=arr1[i]; 
        i++; 
        k++; 
    }

     while(j<m){
        arr[k]=arr2[j]; 
        j++; 
        k++; 
    }
    printf("The sorted array: "); 
    printArray(arr, n+m); 
}

int main(){
    int n; 
    printf("Enter the size of the first array: "); 
    scanf("%d",&n); 
    int arr1[n];
    printf("Enter the elements of the first array: "); 
    for(int i=0; i<n; i++){
        scanf("%d",&arr1[i]);
    }

    int m; 
    printf("Enter the size of the second array: "); 
    scanf("%d", &m); 
    int arr2[m]; 
    printf("Enter the elements of the second array: "); 
    for(int i=0; i<m; i++){
        scanf("%d", &arr2[i]); 
    }
    printArray(arr1, n); 

    mergeArrays(arr1, arr2, n, m); 

}