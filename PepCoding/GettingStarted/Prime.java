import java.util.*;
  
  public class Prime{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int t = scn.nextInt();
      while (t>0){
          int i = scn.nextInt();
          boolean k= true;
          for (int j= 2; j<i; j++){
              if (i%j==0){
                  k = false; 
              }
              
              
          }
          if (k ==true){
              System.out.println("prime"); 
              
          }
          else {
              System.out.println("not prime");
          }
          t--;
      }
  
    
  
   }
  }