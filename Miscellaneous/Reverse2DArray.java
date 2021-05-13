import java.util.*; 
public class Reverse2DArray{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        int n=scn.nextInt(); 
        int m=scn.nextInt(); 
        int [][] arr = new int[n][m]; 
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        for (int i= n-1; i>=0; i--){
            for (int j = m-1; j>=0; j--){
                System.out.print(arr[i][j]+" "); 
            }
            System.out.println();
        }
        scn.close();
    }
}