import java.util.*; 
public class Factorial {
    public static int factorial(int n){
        if (n<=1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        int n = scn.nextInt(); 
        System.out.println(factorial(n));
        scn.close();
    }
}