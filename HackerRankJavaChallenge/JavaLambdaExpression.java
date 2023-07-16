import java.io.*;
import java.util.*;
interface PerformOperation {
 boolean check(int a);
}
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }

   // Write your code here
   PerformOperation isOdd(){
       PerformOperation odd = (int num)->{
       if(num%2==0){
           return false;
       }
       else{
           return true;
       }
   };
   return odd;
   }
   PerformOperation isPrime(){
   PerformOperation prime = (num)->{
       for(int i=2; i<(num/2)+1; i++){
           if(num%i==0){
               return false;
           }
       }
       return true;
   };
   return prime;
   }
   
   PerformOperation isPalindrome(){ 
       PerformOperation palindrome = (num)->{
       int duplicate = 0;
       int temp = num;
       while(num>0){
           int r = num%10;
           duplicate = (duplicate*10)+r;
           num = num/10;
       }
       if(duplicate == temp){
           return true;
       }
      return false;
   };
   return palindrome; 
   }  

}

public class Solution {

 public static void main(String[] args) throws IOException {
  MyMath ob = new MyMath();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}
