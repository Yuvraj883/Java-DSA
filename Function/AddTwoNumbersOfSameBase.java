import java.util.*; 
public class AddTwoNumbersOfSameBase{
    public static int add(int b,int n1,int n2){
        int sum =0; 
        int power =1; 
        int c=0;
        int q= 0;
        while (n1>0 || n2>0 || c>0){
            int d1= n1%10; 
            int d2 = n2%10; 
            n1 /=10; 
            n2 /=10; 
            int d = d1+d2+c; 
            c= d/b; 

            d = d%b;
            d= d* ((int )Math.pow(10, power-1)); 
            sum += d; 
            power++; 
        }
        return sum ; 

    }
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        int base= scn.nextInt(); 
        int n1 = scn.nextInt(); 
        int n2 = scn.nextInt (); 
        System.out.println(add(base, n1, n2)); 
        scn.close();
    }
}