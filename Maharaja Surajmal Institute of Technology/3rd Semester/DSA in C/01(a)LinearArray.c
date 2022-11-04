#include <stdio.h>
#include <stdlib.h> 

int main(){   
    int n; 
    printf("Enter the size of array: "); 
    scanf("%d",&n);

    int arr[n]; 
    printf("Enter array elements: ");
    for (int i=0; i<n; i++){
        scanf("%d",&arr[i]); 
    }

    for(int i=0; i<n; i++){
        printf("%d ",arr[i]);
    }

    return 0; 
}