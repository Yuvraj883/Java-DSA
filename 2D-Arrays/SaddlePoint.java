import java.util.*; 
public class SaddlePoint{
    public static void main(String[] argc){
        Scanner scn = new Scanner (System.in); 
        int n = scn.nextInt(); 
        int [][]arr= new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = scn.nextInt(); 
            }
        }

    
        for (int i=0; i<n; i++){
         int svj =0; //smallest value at j 
         
            for (int j =0; j<n; j++){

                if (arr[i][j]<arr[i][svj]){
            svj = j; 
                    }
                }
                boolean saddle = true; 
                for (int g=0; g<n; g++){
                     if (arr[g][svj]>arr[i][svj]){
                        saddle  = false;
                     }
              
                }
                if (saddle == true){
                    System.out.println(arr[i][svj]);
                    return ; 
            
        }
    }
    System.out.println("Invalid Input");

}
}