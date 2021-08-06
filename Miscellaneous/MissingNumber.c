#include <stdio.h> 
//function to swap two integers 
int swap(int *a, int *b){
    int temp ; 
    temp = *a; 
    *a = *b; 
    *b = temp; 
}

//Bubble sort
int sort(int arr[], int n){
    for (int i=0; i<n-1; i++){
        for (int j = 0; j<n-i-1; j++){
            if(arr[j]>arr[j+1]){
                swap(&arr[j], &arr[j+1]);
            }
        }
    }
}



int main(){
    int n; 
    scanf("%d", &n); 
    int arr[n]; 
    for (int i =0; i<n; i++){
        scanf("%d", &arr[i]);
    }
    sort(arr, n); 

    for (int i=1; i<n; i++){
        if(arr[i]-arr[i-1]>1){
            printf("%d ", arr[i-1]+1); 
        }
    }
    return 0; 

}