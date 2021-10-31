import java.util.*; 
public class DecimalToAnyBase{
    public static int changeToAnyBase(int n, int d){
        int num =0; 
        int power= 1;
        for (int i=n; i>0; i/=d){
            int dig = i%d;
            int mul = ((int) Math.pow(10, power-1));
            num += (dig)*mul;
            //System.out.println(power + " "+ num + " "+i+ " "+ dig+ " "+ mul);

            power++; 
        }
        return num; 

    }
    public static void main (String[] args){
        Scanner scn = new Scanner (System.in);
        int decimal = scn.nextInt();
        int changeToBase = scn.nextInt();
        System.out.println(changeToAnyBase(decimal, changeToBase)); 
        scn.close ();



    }
}