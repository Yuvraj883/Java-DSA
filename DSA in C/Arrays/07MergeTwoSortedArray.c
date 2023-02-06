#include<stdio.h> 

void mergeArrays(int arr1[], int arr2[],  int n, int m){
    int arr[n+m]; 
    int i = 0; 
    int j = 0; 
    int k = 0; 
    while(i<n|| j<m || k<n+m){
        
    }
}

int main(){
    int n; 
    printf("Enter the size of the first array: "); 
    scanf("%d",&n); 
    int arr[n];
    printf("Enter the elements of the first array: "); 
    for(int i=0; i<n; i++){
        scanf("%d",&arr[i]);
    }

    int m; 
    printf("Enter the size of the second array: "); 
    scanf("%d", &m); 
    int arr2[m]; 
    printf("Enter the elements of the second array: "); 
    for(int i=0; i<m; i++){
        scanf("%d", &arr2[m]); 
    }

    mergeArrays(arr, arr2, n, m); 
}