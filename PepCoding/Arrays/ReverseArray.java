import java.util.*; 
public class ReverseArray{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        int n= scn.nextInt();
        int [] arr = new int[n];
        for (int k=0; k<n; k++){
            arr[k]= scn.nextInt();
        }

        int i=0; 
        int j = n-1;
        while (i<j){
            int temp = arr[i];
            arr[i]= arr[j]; 
            arr[j]= temp;
            i++;
            j--;
        }
        for (int k=0; k<n; k++){
            System.out.print(arr[k]+" ");
       }

       scn.close();
    }
}