import java.util.*; 
public class LastIndex{
    public static int lastIndex(int [] arr, int idx,int x){
        if (idx<0){
            return -1 ; 
        }
        int ans = lastIndex(arr, idx-1, x); 
        if(arr[idx]==x){
            return idx; 
        }
         return ans; 

    }
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        int n = scn.nextInt(); 
        int [] arr = new int [n]; 
        for (int i=0; i<n; i++){
            arr[i] = scn.nextInt(); 
        }
        int x = scn.nextInt(); 
        System.out.println(lastIndex(arr, n-1, x)); 
        scn.close(); 
    }
}