import java.util.*; 
import java.math.BigInteger; 
public class Solution{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        BigInteger num; 
        String input = scn.next(); 
        num = new BigInteger(input);
        // isPrime(num);
        System.out.println(num.isProbablePrime(1)?"prime":"not prime");
    }
    // public static void isPrime(BigInteger num){
    //     BigInteger i, two,zero; 
    //     two = BigInteger.valueOf(2);
    //     zero = new BigInteger("0");
       
    //     for( i=BigInteger.valueOf(2); i.compareTo(num.divide(two)); i++){
    //         BigInteger rem = num.remainder(i);
    //         if(rem.compareTo(zero)==zero){
    //             System.out.println("not prime");
    //             return;
    //         }
    //     }
    //     System.out.println("prime");
    // }
}