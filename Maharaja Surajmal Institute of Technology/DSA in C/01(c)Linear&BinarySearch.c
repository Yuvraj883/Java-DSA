#include <stdio.h> 
#include <stdlib.h> 

void linearSearch(int arr[],int n, int key){
    int isPresent=0; 
    for (int i=0; i<n && isPresent==0; i++){
        if(arr[i]==key){
            printf("Number found in the array on index %d using Linear Search.\n",i);
            isPresent=1; 
        }

    } 
    if(!isPresent){
    printf("Number doesn't exist in the array!!\n"); 

    }
}

void binarySearch(int arr[], int n, int key){
    int low = 0; 
    int high = n-1; 
    int mid = (low+high)/2; 
    int isPresent = 0; 

    while(low<high && isPresent ==0){
        if(arr[mid]==key){
            printf("Number found in the array on index %d through Binary Search.\n",mid);
            isPresent=1;  
        }
        else if(arr[mid]>key){
            high = mid-1; 
            mid = (low+high)/2; 
        }
        else if(arr[mid]<key){
            low = mid+1; 
            mid = (low+high)/2; 
        }
    }
     if(!isPresent){
        printf("Number doesn't exist in the array!!\n");
     }

}
int compareInt(const void *ptr1, const void* ptr2){
    const int* p1 = ptr1; 
    const int* p2 = ptr2; 

    return *p1-*p2; 
}


int main(){
    int n; 
    printf("Enter the length of array: "); 
    scanf("%d", &n); 
     
    int arr[n]; 
    printf("Enter the array elements: "); 
    for (int i=0; i<n; i++){
        scanf("%d",&arr[i]); 
    }
    int key; 
    printf("Enter the number you want to search in the array: "); 
    scanf("%d", &key); 

    
    printf("\n"); 
    linearSearch(arr, n, key); 
    qsort(arr, n, sizeof(int), compareInt); //SORTING THE ARRAY BEFORE PERFORMING BINARY SEARCH

    binarySearch(arr, n, key); 
    return 0; 

}