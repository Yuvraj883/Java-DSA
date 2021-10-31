import java.util.*;
  
  public class DigitsInANumber{
  
  public static void main(String[] args) {
    // write your code here
    Scanner scn = new Scanner (System.in); 
    int n = scn.nextInt(); 
    int count =0; 
  for (int i=n; i!=0; i= i/10){
      count ++; 
      
  }
  System.out.println(count); 
  scn.close ();
    
   }
  }