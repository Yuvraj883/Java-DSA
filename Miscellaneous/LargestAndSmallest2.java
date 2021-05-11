import java.util.*; 
public class LargestAndSmallest2{
    public static void Largest(int [] arr){
        int larger = Integer.MIN_VALUE; 
        int largest = Integer.MIN_VALUE; 
        for (int i=0; i<arr.length; i++){
            if (largest<arr[i]){
                larger = largest; 
                largest = arr[i];
            }
            else if (larger <arr[i] && largest>arr[i]){
                larger = arr[i];
            }
        }
        System.out.println("Largest = "+largest); 
        System.out.println("2nd Largest = "+ larger);
    }
    public static void Smallest(int [] arr){
        int smaller = Integer.MAX_VALUE; 
        int smallest = Integer.MAX_VALUE;  
        if(arr.length<=3){
            System.out.println("invalid input"); 
            return ;
        }
        for (int i=0; i<arr.length; i++){
            if(smallest>arr[i]){
                smaller= smallest; 
                smallest= arr[i]; 
            }
            else if (smaller>arr[i] && smallest<arr[i]){
                smaller = arr[i];
            }
          
        
        }
        System.out.println("Smallest element = "+smallest); 
        System.out.println("2nd Smallest element = "+ smaller); 
        Largest(arr);

    }
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        int n= scn.nextInt(); 
        int []arr = new int[n]; 
        for(int i=0; i<n; i++){
            arr[i]= scn.nextInt(); 

        }
        Smallest(arr);
        scn.close();
    }
}