#include <stdio.h> 

int peakIndexInMountainArray(int* arr, int arrSize){
if(arrSize<3){
    printf("Array size is less than 3");
    return 0; 
}
int lo = 0; 
int hi = arrSize-1; 
int mid = (lo+hi)/2; 
int ans = 0; 

while(lo<=hi){
    // printf("%d ",arr[mid]); 
    if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
        // printf("First case"); 
        lo = mid; 
    }
    else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]){
        // printf("Second Case");
        hi = mid; 
    }
    else if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
        // printf("Third Case");
         ans = mid;
         return mid; 
        //  break;
    }
    //  printf("%d ", mid);
    mid = (lo+hi)/2; 
}

// printf("Peak element not found."); 
return ans; 
}


int main(){
    int arr[10]={24,69,100,99,79,78,67,36,26,19}; 
    int size = 10; 
    int idx = peakIndexInMountainArray(arr, size); 
    printf("%d",idx); 
}