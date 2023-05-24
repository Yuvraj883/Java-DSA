import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt(); 
        int []arr = new int[2*n]; 
        for(int i=0; i<2*n; i++){
          arr[i]=scn.nextInt(); 
        }

        int []IDs = new int [n]; 
        int []lengths = new int[n]; 
        for(int i=0; i<n; i++){
          IDs[i] = arr[i]; 
        }

        for(int i=0; i<n; i++){
          lengths[i]= arr[i+n]; 
        }

        for(int i=0; i<n; i++){
          System.out.print(IDs[i]+" "+lengths[i]+" "); 
        }

        // for(int i=0; i<n; i++){
        //   System.out.print(lengths[i]+" "); 
        // }
        

    }
}