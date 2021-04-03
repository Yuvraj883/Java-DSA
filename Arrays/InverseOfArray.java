import java.util.*; 
public class InverseOfArray{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int [] arr = new int [n]; 
        for (int i =0; i<n; i++){
            arr[i]= scn.nextInt();
        }
        
        int [] inv = new int [n];
        for (int i=0; i<n; i++){
            int x =arr[i];
            inv[x]=i;
        }
        for(int i=0; i<n; i++){
        System.out.print(inv[i]+" ");
        }
        scn.close();
    }
}