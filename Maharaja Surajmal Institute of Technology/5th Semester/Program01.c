//Implement linear and binary search

#include<stdio.h>
#include<time.h>

int main(){
    int arr[10]= {1,2,3,4,5,6,7,8,9,10};
    int n = 10;
    int target = 9;
    int flag = 0;
    
    clock_t start,end;
    start=clock();
    
    //Linear search
    for(int i=0;i<n;i++){
        if(target==arr[i]){
            printf("%d found in the array at index %d", target,i );
             flag=1;
            break;
        }
    }
    end = clock();
    
    float linear = (float)(end-start)/CLOCKS_PER_SEC;
    printf("\nIt took %f sec to perform linear search",linear);
    
    if(flag==0){
        printf("%d is not present in  the given array.",flag);
        
    }
    else{
        flag=0;
    }
    
    //Binary search
    int high= n-1;
    int low=0;
    int mid= (low+high)/2;
     start = clock();
    while(low<high){
          if(arr[mid]==target){
                 printf("\n%d found in the array at index %d", target,mid );
                 break;
          }
          else if(arr[mid]>target){
              high=mid-1;
          }
          else if(arr[mid]<target){
              low=mid+1;
          }
          
          mid=(high+low)/2;
    }
    end=clock();
     float binary = (float)(end-start)/CLOCKS_PER_SEC;
     printf("\nIt took %f sec to perform binary search",binary);
    return 0;
    
}