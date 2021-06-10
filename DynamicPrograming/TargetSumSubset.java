import java.util.*; 
public class TargetSumSubset{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        int n = scn.nextInt(); 
        int [] arr = new int [n]; 
        for (int i=0; i<n; i++){
            arr[i]= scn.nextInt(); 
        }

        int tar = scn.nextInt(); 
        boolean dp[][] = new boolean[n+1][tar+1];
        for (int i=0; i<n+1 ;i++){
            for (int j =0; j<tar+1;j++){
                //first cell
                if(i==0 && j==0){
                    dp[i][j]= true;
                }
                //first row
                else if(i ==0){
                    dp[i][j]= false;
                }
                //first col
                else if(j==0){
                    dp[i][j]= true;
                }
                //rest of the matrix
                else{
                    if(dp[i-1][j]==true){
                        dp[i][j]= true;
                    }
                    else{
                        int val = arr[i-1]; 
                        if(j>=val){
                            if(dp[i-1][j-val]== true){
                                dp[i][j]=true; 
                            }
                        }
                    }
                }
            }
        }
        System.out.println(dp[dp.length-1][tar]); 
        scn.close();
    }
}