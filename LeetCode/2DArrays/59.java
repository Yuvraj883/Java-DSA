class Solution {
    public int[][] generateMatrix(int n) {
        
        int [][] matrix = new int [n][n];

        int l = 0; 
        int r = n-1;
        int t= 0; 
        int b = n-1; 
        int count = 1; 

      while(l<=r && t<=b){

          //top wall
          for(int i=l; i<=r; i++){
              matrix[t][i]=count; 
              count++; 
          }
          t++;

          //right wall 
          for(int i=t; i<=b; i++){
              matrix[i][r]=count;
              count++;
          }
            r--;
          //bottom wall

          for(int i=r; i>=l; i--){
              matrix[b][i]=count;
              count++;
          }
            b--;
          //left wall

          for(int i=b; i>=t; i--){
              matrix[i][l]=count;
              count++;
          }
          l++;
      }
      return matrix;


    }
}