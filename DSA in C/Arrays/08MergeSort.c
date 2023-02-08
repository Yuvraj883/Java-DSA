#include <stdio.h> 

void printArray(int arr[], int size){
    for(int i=0; i<size; i++){
        printf("%d ", arr[i]); 
    }
    printf("\n"); 
}


void mergeArrays(int *arr, int l, int r, int mid){
    int l_size = mid-l; 
    int r_size = r-mid-1; 
    int l_arr[l_size]; 
    int r_arr[r_size]; 

    for(int i=0; i<l_size; i++){
        l_arr[i]=arr[i+l]; 
    }

    for(int i=0; i<l_size; i++){
        r_arr[i]=arr[i+mid+1]; 
    }

   
int li =0, ri = 0, m = 0; 
while(l<l_size && r<r_size){
    if(l_arr[li]<r_arr[ri]){
        arr[m]=l_arr[li]; 
        li++; 
        m++; 
    }
    else{
        arr[m]=r_arr[ri]; 
        ri++; 
        m++; 
    }
}

}

void mergeSort(int *arr, int l, int r){
    if(l==r){
        return; 
    }
    int mid = (l+r)/2; 
    mergeSort(arr, l, mid);
    mergeSort(arr, mid+1, r); 
    mergeArrays(arr,l,r, mid); 
    // printArray(arr,l+r);

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
}