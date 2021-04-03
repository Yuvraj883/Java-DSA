import java.util.*; 
public class SubArrays{
    public static void main(String[] argc){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); 
        int [] arr = new int [n]; 
        for (int i = 0 ; i<n; i++){
            arr[i] = scn.nextInt(); 
        }

        for (int i =0; i<n; i++){
            for (int j =i; j<n; j++){
                for (int k=i; k<=j;k++){
                System.out.print(arr[k]+"\t");
                }
            System.out.println();

            }
        }
    }
}