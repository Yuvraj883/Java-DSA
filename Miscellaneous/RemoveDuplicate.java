import java.util.*; 
public class RemoveDuplicate{
    public static void main(String[] args){
        Scanner scn =   new Scanner (System.in); 
        int n = scn.nextInt(); 
        int [] arr = new int [n]; 
        for (int i=0; i<n; i++){
            arr[i]= scn.nextInt();

        }
       Arrays.sort(arr); 
       System.out.print(arr[0]+" ");
       for (int i=1; i<n; i++){
           
           if(arr[i]!=arr[i-1]){
            System.out.print(arr[i]+" "); 
           }
       }
       System.out.println();
       scn.close();
    }
}