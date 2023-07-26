import java.util.*;

public class Main {

  public static void main(String[] args) {
    // Write your code here
    int n=5; 
    for(int i=0; i<n; i++){
        System.out.print("*");
    }
    System.out.println();
    for(int i=3; i>0; i--){
        for(int j=i; j>0; j--){
            System.out.print(" "); 
        }
        System.out.print("*");
         System.out.println();
    }
    for(int i=0; i<n; i++){
        System.out.print("*");
    }
     System.out.println();

  }
}