import java.util.*; 
class Transpose{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        System.out.print("Enter the rows and cols: "); 
        int row = scn.nextInt();
        int col = scn.nextInt(); 
        int [][] arr = new int [row][col]; 
        System.out.print("Enter the elements of matrix: "); 
        for (int i =0; i<row; i++){
            for (int j=0; j<col; j++){
                arr[i][j] = scn.nextInt(); 
            }
        }

        System.out.println("Following is the transpose of the matrix: "); 
        for (int i =0; i<row; i++){
            for (int j=0; j<col; j++){
                System.out.print(arr[j][i]+" "); 
            }
            System.out.println(); 
        
        }
        scn.close();
    }
}