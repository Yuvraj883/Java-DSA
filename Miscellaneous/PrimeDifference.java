/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class PrimeDifference{
   public static boolean isPrime(int n){
      for (int i =2; i*i<=n; i++){
         if (n%i==0){
            return false ; 
         }
      }
      return true; 
   }
   public static void main(String args[] ) throws Exception {
      Scanner scn = new Scanner (System.in); 
      int t = scn.nextInt(); 
      while (t>0){
         int left = scn.nextInt() ;
          int right = scn.nextInt(); 
          ArrayList<Integer> list = new ArrayList<>();
         for (int i=left; i<=right; i++){
            if(isPrime(i)== true){
               list.add(i); 
            }
         }
         if(list.size()==1){
            System.out.println("0"); 
         }
         else if (list.size()==0){
            System.out.println("-1"); 
         }
         else {
             int l = list.size()-1;
            int first= list.get(0); 
            int second = list.get(l); 
            int res = second- first; 
            System.out.println(res); 
         }
         t--;
      }
	

   }
}
