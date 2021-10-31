import java.util.*; 
public class SpanOfArray{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        int n= scn.nextInt(); 
        int [] arr= new int[n];
        for (int i=0; i<n; i++){
            arr[i]= scn.nextInt();
        }
        int min =arr[0];
        int max = arr[n-1];
        for (int i=0; i<n; i++){
            if (arr[i]<min){
                min = arr[i];
            }

            if (max <arr[i]){
                max = arr[i];
            }
        }
        int res = max -min ; 
        System.out.println (res);
        scn.close ();
    }
}