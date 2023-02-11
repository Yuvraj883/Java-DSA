#include <stdio.h> 

void printArray(int arr[], int size){
    for(int i=0; i<size; i++){
        printf("%d ", arr[i]); 
    }
    printf("\n"); 
}

void printPart(int arr[], int start, int end){
    for(int i=start; i<end; i++){
        printf("%d ", arr[i]); 
    }
    printf("\n");
}


void mergeArrays(int *arr, int l, int r, int mid){
   int n1 = mid-l+1; 
   int n2 = r-mid; 
   int left[n1]; 
   int right[n2]; 
    
   for(int i=0; i<n1; i++){
    left[i]=arr[i+l]; 
   }

   for(int j=0; j<n2; j++){
    right[j]=arr[j+1+mid]; 
   }
   
   int i=0, j=0,k=0; 
   while(i<n1 && j<n2){
    if(left[i]<right[j]){
        arr[k]=left[i];
        i++; 
        k++;  
    }
    else{
        arr[k]=right[j]; 
        j++; 
        k++; 
    }
   }

   while(i<n1){
    arr[k]=left[i]; 
    i++; 
    k++; 
   }
    while(j<n2){
    arr[k]=right[j]; 
    k++; 
    j++;
   }

   

}

void mergeSort(int *arr, int l, int r){
    if(l>=r){
        return; 
    }
    int mid = (l+r)/2; 
    mergeSort(arr, l, mid);
    printPart(arr, l, mid);
    mergeSort(arr, mid+1, r); 
    // printPart(arr, mid-1, r);
     mergeArrays(arr,l,r, mid); 

}

int main(){
    int n; 
    printf("Enter the length of the array: "); 
    scanf("%d",&n); 
    int arr[n]; 
    printf("Enter the elements of the array: "); 
    for(int i=0; i<n; i++){
        scanf("%d",&arr[i]); 
    }
    mergeSort(arr,0,n-1); 
    printArray(arr,n); 
    // printArray(arr,n);
}