import java.math.BigDecimal;
import java.util.*; 
public class Miscellaeous{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        double a = 3.03; 
        double b = 1.07; 
        BigDecimal _a = new BigDecimal(a); 
        BigDecimal _b = new BigDecimal(b); 
        BigDecimal c = _b.subtract(_a); 
        System.out.println(c);
    }
}