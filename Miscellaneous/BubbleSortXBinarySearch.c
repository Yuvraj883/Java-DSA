#include<stdio.h> 

void binarySearch(int arr[], int n, int key){
    int isPresent=0; 
    int hi = n; 
    int lo = 0; 
    int mid = (hi+lo)/2; 
    while(hi>=lo){
        mid = (hi+lo)/2; 
        if(arr[mid]==key){
            printf("%d found in the array at index %d.", key, mid);
            isPresent = 1; 
            break;
        }
        else if(arr[mid]>key){
            hi = mid-1; 
        }
        else if(arr[mid]<key){
            lo = mid+1; 
        }
    }
    if(isPresent==0){
        printf("Couldn't find %d in the array.",key); 
    }
}

void bubbleSort(int arr[], int n){
    for(int i=0; i<n; i++){
        for(int j=i; j<n; j++){
            if(arr[i]>arr[j]){
                int temp = arr[i]; 
                arr[i]=arr[j]; 
                arr[j]=temp; 
            }
        }
    }
    
}

int main(){
    int n; 
    printf("Enter the size of the array: "); 
    scanf("%d",&n);
    int arr[n]; 
    printf("Enter the array elements: "); 
    for(int i=0; i<n; i++){
        scanf("%d",&arr[i]); 
    }
    
    int key; 
    printf("Enter the key you want to search in the array: "); 
    scanf("%d",&key); 
    bubbleSort(arr,n); 
    printf("The sorted array: "); 
    for(int i=0; i<n; i++){
        printf("%d ", arr[i]); 
    }
    printf("\n"); 
    binarySearch(arr, n, key); 
    
}