#include<stdio.h> 
#include<stdlib.h> 

void merge(int arr[], int left, int mid, int right){
    int i=left; 
    int j=mid+1; 
    int k=left; 
    int *temp = (int* )malloc((100)*sizeof(int)); 
    // printf("Merge: "); 
    while(i<mid+1 && j<=right){
        if(arr[i]<arr[j]){
            temp[k]=arr[i]; 
            i++; 
            k++;
        }
        else{
            temp[k]=arr[j]; 
            j++; 
            k++; 
        }
    }
    while(i<mid+1){
        temp[k]=arr[i]; 
        k++; 
        i++; 
    }
    while(j<=right){
        temp[k]=arr[j]; 
        k++;
        j++; 
    }
    for( i=left; i<=right; i++){
        arr[i]=temp[i];
    }
}

void mergeSort(int arr[], int left, int right){
    if(left>=right){
        return; 
    }
    // printf("Merge sort");
    int mid = (left+right)/2; 
    mergeSort(arr, left, mid); 
    mergeSort(arr, mid+1, right); 
    merge(arr, left, mid, right); 
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
    for(int i=0; i<n; i++){
        printf("%d ",arr[i]); 
    }
    printf("\n"); 
    mergeSort(arr,0, n); 
    printf("Sorted Array: "); 
    for(int i=0; i<n; i++){
        printf("%d ",arr[i]); 
    }
}