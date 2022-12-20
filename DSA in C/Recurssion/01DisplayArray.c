#include<stdio.h> 

void displayArray(int arr[], int n){
    if(n<0){
        return;
    }
    displayArray(arr, n-1); 
    printf("%d ",arr[n]);
}

int main(){
    int n; 
    printf("Enter the length of the array: "); 
    scanf("%d",&n); 
    int arr[n]; 
    printf("Enter array elements: "); 
    for(int i=0; i<n; i++){
        scanf("%d",&arr[i]);
    }
    displayArray(arr, n-1); 
    
}