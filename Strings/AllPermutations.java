import java.util.*; 
public class AllPermutations{
    public static int factorial(int n){
        if (n<=1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
        
    }
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        String str = scn.next(); 
        int n= str.length(); 
        int f = factorial(n);
        for (int i=0; i<f; i++){
            StringBuilder sb = new StringBuilder(str); 
            int temp = i;
            for (int j = n; j>=1; j--){
                int q= temp/j; 
                int r= temp %j; 
                System.out.print(sb.charAt(r)); 
                sb.deleteCharAt(r);
                temp =q; 
            }
            System.out.println(); 
        }
        scn.close();    
    }
}