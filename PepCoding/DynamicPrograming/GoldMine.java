import java.util.*; 
public class GoldMine{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt(); 
        int m = scn.nextInt(); 
        int [][] arr = new int [n][m]; 
        for (int i =0; i<arr.length; i++){
            for (int j = 0; j<arr[0].length; j++){
                arr[i][j]= scn.nextInt();
            }
        }

        int dp [][]= new int [n][m]; 
        for (int j= dp[0].length-1; j>=0; j--){
            for (int i = dp.length-1; i>=0; i--){
                //Last col
                if(dp[0].length-1 ==j){
                    dp[i][j]=arr[i][j];
                }
                //Top row
                else if(dp.length-1==i){
                    dp[i][j]= Math.max(dp[i][j+1], dp[i-1][j+1])+arr[i][j];
                }
                //Bottom row
                else if(i==0){
                    dp [i][j]= Math.max(dp[i][j+1], dp[i+1][j+1])+arr[i][j];
                }
                //Rest of the matrix
                else{
                    dp[i][j]=Math.max(dp[i][j+1],Math.max(dp[i+1][j+1], dp[i-1][j+1]))+arr[i][j];
                }
            }
        }
        int max = dp[0][0]; 
        for (int i=1; i<dp.length-1; i++){
         max = Math.max(max, dp[i][0]);
        }
        System.out.println(max);
        scn.close();
    }
}