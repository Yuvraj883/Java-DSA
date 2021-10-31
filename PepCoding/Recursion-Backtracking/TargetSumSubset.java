import java.util.*; 
public class TargetSumSubset{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        int n = scn.nextInt(); 
        int [] arr = new int [n]; 
        for (int i=0; i<n; i++){
            arr[i] = scn.nextInt();
               
        }
        int tar = scn.nextInt(); 
        targetSumSubset(arr,tar, 0,0, "" ); 
        scn.close();
    }
    public static void targetSumSubset(int[] arr, int tar, int idx, int sum, String ans){
        if(idx == arr.length){
            if(sum==tar){
                System.out.println(ans+".");
            }
            return; 
        }
        targetSumSubset(arr, tar, idx+1,sum+arr[idx], ans+arr[idx]+", " ); 
        targetSumSubset(arr, tar, idx+1, sum, ans);

    }
}