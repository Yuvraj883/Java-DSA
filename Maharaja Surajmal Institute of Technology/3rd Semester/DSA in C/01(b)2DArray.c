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
    printMatrix(r1,c1,sum); 
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
// printf("First Matrix\n");
//    printMatrix( rows1, cols1,arr1); 
// printf("\n");

// printf("Second Matrix\n");
//    printMatrix( rows2, cols2,arr2); 
// printf("\n");
    addMatrix(rows1,cols1, arr1, rows2, cols2, arr2); 
    return 0;
}