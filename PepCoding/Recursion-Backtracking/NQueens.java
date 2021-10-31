import java.util.*; 
public class NQueens{
    public static void main(String [] args){
        Scanner scn = new Scanner (System.in); 
        int n = scn.nextInt(); 
        int [][] arr = new int [n][n]; 
        printQueens(arr, 0, "");
        scn.close();
    }
    public static void printQueens(int [][] chess, int row, String ans){
        
        if (row == chess.length){
            System.out.println(ans+"."); 
            return ;
        }
        
        for (int i=0; i<chess.length; i++){
            if(isQueenSafe(chess, row, i)==true){
            chess[row][i]=1; 
            printQueens(chess, row+1, ans+row+"-"+i+", "); 
            chess[row][i]=0;
            }
        }
        
    }
    public static boolean isQueenSafe(int [][]arr, int row, int col){
        for (int i=row, j=col; i>=0; i--){
            if(arr[i][j]==1){
                return false; 
            }
        }
      
        for (int i=row, j=col; i>=0 && j>=0; i--,j--){
            if(arr[i][j]==1){
                return false;
            }
        }
        for (int i=row, j=col; i>=0 && j<arr.length; i--, j++){
            if(arr[i][j]==1){
                return false; 
            }
        }
        return true; 
    }
    
}