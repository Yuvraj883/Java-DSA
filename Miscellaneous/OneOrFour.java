import java.util.*; 
public class OneOrFour{
    public static boolean oneOrFour(int [] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1 || arr[i]==4){
                continue; 
            }
            else{
                return false; 
            }
        }
        return true ;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        int n= scn.nextInt(); 
        int [] arr= new int [n]; 
        for (int i=0; i<n; i++){
            arr[i] = scn.nextInt(); 
        }
      System.out.println(oneOrFour(arr)); 
        scn.close(); 

    }
}