#include<stdio.h>
#include<time.h>

int main(){
    int arr[10] = {2,3,1,5,9,10,7,8,6,4};
    clock_t start, end; 
    
    printf("Unsorted array: ");
     for(int i = 0; i<10; i++){
        printf("%d ", arr[i]);
    }
    
    //insertion sort
    start = clock();
    for(int i=1; i<10; i++){
        int temp = arr[i];
        int j = i-1;
        while(j>=0 && temp<arr[j]){
            arr[j+1]=arr[j];
            j--;
        }

        arr[j+1] = temp;
        
    }
    end = clock();
    
    printf("\nSorted Array: ");
    for(int i = 0; i<10; i++){
        printf("%d ", arr[i]);
    }
    printf("\nTime taken to sort the array using Insertion sort: %f seconds", (float)(end-start)/CLOCKS_PER_SEC);
    return 0;
}