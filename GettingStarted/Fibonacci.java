import java.util.*; 
public class Fibonacci{
    public static void main (String[] args ){
        
        Scanner scn = new Scanner (System.in); 
        int n = scn.nextInt(); 
        int x=0; 
        int y=1;
        int temp ; 
        for (int i=0; i<n; i++){
        
        System.out.println(x); 
        temp = x+y; 
        x=y; 
        y= temp; 
        
        }
        scn.close ();
        
        
    }
    
}