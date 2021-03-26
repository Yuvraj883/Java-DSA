import java.util.*; 
public class AnyBaseToDecimal{
    public static int anyBaseToDecimal(int n, int b){
        int num = 0; 
        int power = 1; 
        for (int i =n; i>0; i/=10){
            int dig = i%b; 
            int mul = ((int ) Math.pow(b, power-1));
            num += dig *mul; 
            power++;
        }
        return num; 
    }
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        int num = scn.nextInt(); 
        int base = scn.nextInt();
        System.out.println(anyBaseToDecimal(num, base));
        scn.close();
    }
}