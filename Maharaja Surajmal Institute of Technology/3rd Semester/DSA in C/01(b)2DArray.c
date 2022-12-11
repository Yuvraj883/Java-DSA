#include <stdio.h> 
void printMatrix( int rows, int cols, int arr[][cols]){
    for (int i=0; i<rows; i++){
        for (int j=0; j<cols; j++){
            printf("%d ",arr[i][j]);
        }
        printf("\n"); 
    }
}
void addMatrix(int r1, int c1, int arr1[][c1], int r2, int c2, int arr2[][c2]){
    if(r1!=r2 && c1!=c2){
        printf("The two matrices aren't compatible for adding."); 
        return; 
    }
    int sum[r1][c1]; 
    for (int i=0; i<r1; i++){
        for (int j=0; j<c1; j++){
            sum[i][j]=arr1[i][j]+arr2[i][j]; 
        }
    }
    printf("\nFollowing is the sum of two matrices: \n"); 
    printMatrix(r1,c1,sum); 
}

void transposeMatrix(int rows, int cols, int arr[][cols]){
    for(int i=0;i<cols; i++){
        for(int j=0; j<rows; j++){
            printf("%d ",arr[j][i]);
        }
        printf("\n");
    }
}

int main(){
   int rows1, cols1, rows2, cols2; 
   printf("Enter the numbers of rows and cols in the first matrix: "); 
   scanf("%d %d",&rows1, &cols1); 
   int arr1[rows1][cols1];

   printf("Enter the elements of the first matrix: ");  
   for (int i=0; i<rows1; i++){
    for(int j=0; j<cols1; j++){ 
        scanf("%d",&arr1[i][j]); 
    }
   }

   printf("Enter the numbers of rows and cols in the second matrix: "); 
   scanf("%d %d",&rows2, &cols2); 
   int arr2[rows2][cols2];

   printf("Enter the elements of the second matrix: ");  
   for (int i=0; i<rows2; i++){
    for(int j=0; j<cols2; j++){ 
        scanf("%d",&arr2[i][j]); 
    }
   }

    addMatrix(rows1,cols1, arr1, rows2, cols2, arr2);
    if(rows1!=cols2){
        printf("Invalid Input! These two matrices can't be multiplied together.");
    } 

    else{
        int prod[rows1][cols2];
           for(int i=0; i<rows1; i++){
        for(int j=0; j<cols2; j++){
            prod[i][j]=0;
        }
        
    }

        for(int i=0; i<rows1; i++){
            for(int j=0; j<cols2; j++){
                for(int k=0; k<cols2; k++){
                    prod[i][j]+= arr2[k][j] * arr1[i][k]; 
                }
            }
        }
        printf("Product of the two matrices is: \n");
    
    printMatrix(rows1, cols2, prod);
    }
    printf("Following is the transpose of the first matrix: \n"); 
    transposeMatrix(rows1,cols1,arr1);
    printf("Following is the transpose of the second matrix: \n"); 
    transposeMatrix(rows2,cols2,arr2); 
 
    return 0;
}