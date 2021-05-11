import java.util.*; 
public class LargestAndSmallest2{
    public static void Smallest(int [] arr){
        int smaller = Integer.MAX_VALUE; 
        int smallest = Integer.MAX_VALUE;  
        if(arr.length<=3){
            System.out.println("invalid input"); 
            return ;
        }
        for (int i=1; i<arr.length; i++){
            if(smaller>arr[i]){
                smaller= smallest; 
                smallest= arr[i]; 
            }
            else if (smallest >arr[i] && smaller!=arr[i]){

            }
        }

    }
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        int n= scn.nextInt(); 
        int []arr = new int[n]; 
        for(int i=0; i<n; i++){
            arr[i]= scn.nextInt(); 

        }
        Smallest(arr);
    }
}