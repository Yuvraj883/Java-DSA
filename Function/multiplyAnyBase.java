import java.util.*;

public class multiplyAnyBase {
    public static int Sum(int n1, int n2, int b) {
        int sum = 0;
        int p = 1;
        int c = 0;
        while (n1 > 0 || n2 > 0 || c > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n2 /= 10;
            n1 /= 10;
            int d = d1 + d2+c;
            c = d / b;
            d = d % b;
            d = d * p;
            p = p * 10;
            sum += d;

        }
        return sum;

    }

    public static int product(int n1, int n2, int b) {
        int rv = 0;
        int p = 1;
        while (n2 > 0) {
            int d2 = n2 % 10;
            n2 = n2 / 10;
            int sdp = singleDigitProduct(n1, d2, b);
            rv = Sum(rv, sdp * p, b);
            p *=10;
        }
        return rv;
    }

    public static int singleDigitProduct(int n1, int d2, int b) {
        int rv = 0;
        int c = 0;
        int p = 1;

        while (n1 > 0 || c > 0) {

            int d1 = n1 % 10;
            n1 = n1 / 10;
            int d = d1 * d2 + c;
            c = d / b;
            d = (d % b) * p;
            p = p * 10;
            rv += d;
            
        }
        return rv;
    }

    public static void main (String[] args){
        Scanner scn = new Scanner (System.in); 
        int b = scn.nextInt();

        int n1 = scn.nextInt(); 
        int n2 = scn.nextInt(); 
    System.out.println (product (n1, n2, b));
    scn.close();
    }
}
