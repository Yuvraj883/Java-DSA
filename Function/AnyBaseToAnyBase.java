import java.util.*; git
public class AnyBaseToAnyBase{
    public static int decimalToAnyBase(int n, int d){
        int num = 0; 
        int power = 1; 
    for (int i=n; i>0; i/=d){
        int dig = i%d; 
        int mul = ((int )Math.pow(10, power-1));
        num += dig * mul; 
        power++;    
    }
   // System.out.println(num);
    return num; 
    }
    public static int anyBaseToDecimal(int n, int b, int d){
        int dec =0; 
        int power= 1;
     
        for (int i=n; i>0; i/=10){
            int dig = i%10; 
            int mul = ((int ) Math.pow(b, power-1));
            dec += dig * mul; 
            power++;
        }
//        System.out.println(dec);
       return decimalToAnyBase(dec, d);
        }
            public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        int num = scn.nextInt(); 
        int inBase = scn.nextInt(); 
        int toBase = scn.nextInt(); 
        System.out.println(anyBaseToDecimal(num, inBase, toBase));
        scn.close();
    }
}