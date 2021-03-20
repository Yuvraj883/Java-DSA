import java.util.*;
    
    public class DigitsOfANumber{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner scn = new Scanner (System.in ); 
      int n= scn.nextInt(); 
     int  count=0; 
      for (int i=n; i!=0; i= i/10){
          count ++; 
      }
      int  div=1; 
      for (int i=count ; i!=0; i--){
          div = div *10; 
      }
      
      for (int i= div ; i!=10; i= i/10){
        System.out.println(n/div);
      }
      scn.close ();
     }
    }