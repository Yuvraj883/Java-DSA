import java.util.*; 
public class MaxMin{
    public static void maxMin(int []arr, int n){
        int min = arr[0]; 
        int max = arr[0]; 
        for (int i=1; i<n; i++){
            if (min>arr[i]){
                min = arr[i]; 
            }
            else if (max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(min); 
        System.out.println(max); 
    }
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        int n= scn.nextInt(); 
        int []arr = new int[n]; 
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt(); 
        }

        maxMin(arr, n); 
        scn.close();
    }
}