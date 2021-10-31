import java.util.*;
public class FloodFill{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
         int n = scn.nextInt(); 
         int m = scn.nextInt(); 
         int [][] arr = new int [n][m]; 
         for (int i=0; i<n; i++){
             for (int j=0; j<m; j++){
                 arr[i][j]= scn.nextInt(); 
             }
         }
         boolean [][] visited = new boolean [n][m];
         floodFill(arr, 0, 0, "", visited); 
         scn.close();
    }

    public static void floodFill(int [][] arr, int row, int col, String ans, boolean[][] visited){
        if(col<0 || row<0 || col>arr[0].length-1 || row>arr.length-1||arr[row][col]==1 || visited[row][col]==true){
            return ;
        }
        if (col==arr[0].length-1 && row == arr.length-1){
            System.out.println(ans); 
            return ; 
        }
        visited[row][col]=true;
        floodFill(arr, row-1, col, ans+"t", visited);
        floodFill(arr, row, col-1, ans+"l", visited);
        
        floodFill(arr, row+1, col, ans+"d", visited);
         floodFill(arr, row, col+1, ans+"r",visited);
        
        visited[row][col]=false; 
    }
}