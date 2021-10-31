import java.util.*;

public class InverseOfANumber {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int sum=0;
        int count = 1;
        for (int i = num; i != 0; i /= 10) {
           
            int dig = i%10;
            sum += dig*(int)Math.pow(10, count-1);
            count ++; 
        }
        System.out.println(sum);
        scn.close ();
    }
}