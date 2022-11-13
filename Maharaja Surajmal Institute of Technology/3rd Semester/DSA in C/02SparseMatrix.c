#include <stdio.h> 

int main(){
    int row, col;
    printf("Enter the number of rows and cols in the matrix: "); 
    scanf("%d %d",&row, &col);
    int arr[row][col]; 
    printf("Enter the elements of the Matrix: \n"); 

    for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            int x; 
            scanf("%d",&x);
            arr[i][j]=x; 
        }
    }

    int isSparse = 0; 
    int counter = 0; 
    int size = 0; 
    for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            if(arr[i][j]==0){
                counter++; 
            }   
            else{
                size++; 
            }        
        }
    }
    if(counter>(row*col)/2){
        isSparse = 1;
    }
    int compact[3][size];
    int k=0;
    for(int i=0; i<3; i++){
        for(int j=0; j<size; j++,k++){
            if(arr[i][j]!=0){
                compact[0][k] = i; 
                compact[1][k] = j;
                compact[2][k] = arr[i][j]; 
                k++; 
            }
        }
    }
      for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                printf("%d ",arr[i][j]); 
            }
            printf("\n"); 
        }


    if(isSparse){
        printf("The given matrix is a sparse matrix.\n");
        for(int i=0; i<3; i++){
            for(int j=0; j<size; j++){
                printf("%d ",compact[i][j]); 
            }
            printf("\n"); 
        }

    }
    else{
        printf("The given matrix isn't a sparse matrix."); 
    }

    return 0; 
}