import java.util.*; 
public class StateOfWakanda{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        int r= scn.nextInt(); 
        int c = scn.nextInt(); 
        int [][] arr = new int [r][c];
        for (int i =0; i<arr.length ; i++){
            for (int j=0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        for (int i=0; i<arr[0].length; i++){
           if(i%2==0){
            for(int j=0; j<arr.length; j++){
                System.out.println(arr[j][i]);
            }
           }
           else{
            for(int j=arr.length-1; j>=0; j--){
                System.out.println(arr[j][i]);
            }
           }
           
           // System.out.println();
        }
        scn.close();
    }
}