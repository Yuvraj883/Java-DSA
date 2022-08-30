import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in); 
        String str1 = scn.next(); 
        String str2 = scn.next(); 
        BigInteger A,B,sum,product; 
        A= new BigInteger(str1);
        B = new BigInteger(str2);
        sum = A.add(B);
        product = A.multiply(B);
        System.out.println(sum);
        System.out.println(product); 
    
    }
}