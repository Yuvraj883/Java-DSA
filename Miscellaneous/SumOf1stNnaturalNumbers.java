import java.util.*; 
public class SumOf1stNnaturalNumbers{
    public static int Sum (int n){
        if (n==1){
            return n; 
        }
        return n + Sum(n-1); 
    }
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        int n= scn.nextInt(); 
        System.out.println(Sum(n)); 
        scn.close(); 
    }
}