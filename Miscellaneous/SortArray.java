import java.util.*; 
public class SortArray{
  public static void  displayArray(int [] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void sortArray(int [] arr){
        for (int i=0; i<arr.length; i++){
            int temp =0; 
            for (int j =i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i]; 
                    arr[i]= arr[j]; 
                    arr[j]= temp; 
                }
            }
        }
        displayArray(arr); 
    }
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        int n = scn.nextInt(); 
        int []arr = new int [n]; 
        for (int i=0; i<n; i++){
            arr[i]= scn.nextInt(); 
        }
        sortArray(arr);
        scn.close(); 
    }
}