import java.util.*; 
public class MinCostMazeTraversal{
    public static void main(String [] args){
        Scanner scn = new Scanner (System.in); 
        int n = scn.nextInt(); 
        int m = scn.nextInt(); 
        int [][] arr = new int [n][m]; 
        for (int i =0; i<n; i++){
            for (int j = 0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int [][] dp = new int [n][m] ; 
        for (int i= dp.length-1; i>=0; i--){
            for (int j = dp[0].length-1; j>=0; j--){
                if(j==dp[0].length-1 && i==dp.length-1){
                    dp[i][j]= arr[i][j];
                }
                else if(j == dp[0].length-1){
                    dp[i][j]=dp[i+1][j]+arr[i][j];
                }
                else if(i == dp.length-1){
                    dp[i][j] = dp[i][j+1]+arr[i][j];
                }
                else{
                    dp[i][j]= Math.min(dp[i][j+1], dp[i+1][j])+arr[i][j];
                }
            }
        }
        System.out.println(dp[0][0]);
        scn.close();
    }
}