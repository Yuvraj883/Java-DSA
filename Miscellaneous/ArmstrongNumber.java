import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] argc) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 0;
        for (int i = n; i > 0; i /= 10) {
            count++;

        }
        isArmstrong(n, count);
        scn.close();
    }

    public static void isArmstrong(int n, int count) {
        int num = 0;
        for (int i = n; i > 0; i /= 10) {
            num += Math.pow(i % 10, count);
        }
        if (num == n) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}