#include <stdio.h> 

void selectionSort(int *arr, int n){
    int min = 0; 
    int count = 0;
    for(int i=0; i<n-1; i++){
        count++; 
       min = arr[i]; 
       int pos = i;
       for(int j =i; j<n; j++){
        count++; 

        if(min>arr[j]){
            min=arr[j]; 
            pos = j; 
        }
       } 
       if(arr[i]>min){
        int temp = arr[i];
        arr[i]= arr[pos];
        arr[pos]=temp;
       }

    }
    printf("\n Count = %d\n", count); 
}
void printArray(int arr[], int n){
 for(int i=0; i<n; i++){
        printf("%d ",arr[i]);
    }
    printf("\n"); 
}

int main(){
    int n; 
    printf("Enter the length of the array: "); 
    scanf("%d",&n); 
    int arr[n]; 
    printf("Enter the element of the array: "); 
    for(int i=0; i<n; i++){
        scanf("%d",&arr[i]);
    }
    printf("The array: "); 
    printArray(arr, n); 
   

    selectionSort(arr, n);
    printf("The sorted array: "); 
    printArray(arr, n);

}