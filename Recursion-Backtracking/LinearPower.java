import java.util.*; 
public class LinearPower{
    public static int toThePower(int x, int n){
        
        if(n ==0){
            return 1; 
        }
        else{
         //x *=y; 
           return x* toThePower(x, n-1); 
           
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        int x = scn.nextInt(); 
        int n = scn.nextInt();
        int y= x; 
        System.out.println(toThePower(x, n));
        scn.close();
    }
}