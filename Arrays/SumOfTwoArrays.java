import java.util.*; 
public class SumOfTwoArrays{
    public static void main(String[] args){

        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int [] arr1 = new int [n]; 
        for (int i=0; i<n; i++){
            arr1[i]= scn.nextInt(); 
        }

        int m = scn.nextInt(); 
        int []arr2 = new int [m]; 
        for (int i= 0; i<m; i++){
            arr2[i] = scn.nextInt();
        }
        int x = 0;

        if (m>=n){
            x=m;
        }
        else{
            x =n;
        }
        int [] arr = new int [x]; 
       int i= n-1; 
       int j = m-1; 
       int k = x-1; 
       int c = 0; 
       while (k>=0){
           int d = 0;
           d +=c; 
           if (i>=0){
               d+=arr1[i];
           }
           if (j>=0){
               d+=arr2[j];
           }
           c = d/10; 
           d = d%10; 
           arr[k]= d;
           k--;
           i--;
           j--;
       }
       if (c !=0){
           System.out.print(c);
       }
        for (int u=0; u<x; u++){
            System.out.print(arr[u]);
        }
        System.out.println();
        scn.close();
    }
}