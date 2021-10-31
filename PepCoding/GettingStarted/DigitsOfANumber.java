import java.util.*;

import java.util.*;
public class DigitsOfANumber{
  public static void main (String[] args){

    Scanner scn = new Scanner (System.in); 
    int num= scn.nextInt(); 
    int count= 0; 
    for (int i=num; i!=0; i/=10){
      count ++; 
    }
    int div = (int) Math.pow(10, count -1); 

    while (div !=0){
       int q= num/div; 
       System.out.println(q);
       num = num%div; 
       div = div/10; 

    }
    scn.close ();
  }
}