import java.util.* ; 
public class SubtractAnyBase{
    public static int Subtract(int b, int n1, int n2){
        int diff=0; 
        int power =1;
        int c=0; 
        while (n2>0){
            int d1 = n1%10;
            int d2= n2%10; 
            n1 /=10; 
            n2 /=10; 
            int d = d2-d1-c; 
            if (d<0){
                c= 1; 
                d +=b; 
            }
            else {
                c =0; 

            }
            d = d*((int)Math.pow(10, power-1));
            diff += d;
            power++;
        }
    return diff;       
    }
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        int base = scn.nextInt(); 
        int n1 = scn.nextInt(); 
        int n2 = scn.nextInt();
    System.out.println(Subtract(base, n1, n2));
    scn.close();

    }
}