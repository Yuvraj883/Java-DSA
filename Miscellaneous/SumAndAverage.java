import java.util.*; 
public class SumAndAverage{
    public static void averageOfArray(int [] arr, int n, int sum){
        int avg =sum/n; 
        System.out.println("Average ="+avg); 
       
    }
    public static void sumOfArray(int[] arr, int n){
       int sum =0; 
        for (int i=0; i<n; i++){
            sum += arr[i];
        }
        System.out.println("Sum ="+sum); 
        averageOfArray(arr, n, sum); 

    }
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        int n= scn.nextInt(); 
        int []arr = new int[n]; 
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt(); 
        }
        sumOfArray(arr, n); 
        scn.close(); 
    }
}