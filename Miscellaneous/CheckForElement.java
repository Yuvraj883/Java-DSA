import java.util.*; 
public class CheckForElement{
    public static int checkForElement(int []arr, int idx, int x ){
        if (idx == arr.length){
            return -1; 
        }
        if (arr[idx]== x){
            return idx; 
        }
        else{
            int ans = checkForElement(arr, idx+1, x); 
            return ans; 
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        int n= scn.nextInt(); 
        int [] arr = new int[n]; 
        for (int i=0; i<n; i++){
            arr[i]= scn.nextInt(); 
        }

        int x = scn.nextInt(); 
        System.out.println(checkForElement(arr, 0, x));
        scn.close();  
    }
}