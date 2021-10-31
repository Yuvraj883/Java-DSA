import java.util.*; 
public class LogarithmicPower{
    public static int power(int x, int n){
        if (n==0){
            return 1;
        }
        else{
            int xtnb2 = power(x, n/2); //x to the power n by 2
            int xn = xtnb2*xtnb2 ; 
            if (n%2 == 1){
                xn = xn*x; 
            }
            return xn ; 
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        int x = scn.nextInt();
        int n = scn.nextInt(); 
        System.out.println(power(x,n)); 
        scn.close(); 
    }
}