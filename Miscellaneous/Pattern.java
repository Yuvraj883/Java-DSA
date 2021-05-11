import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        int a = 2;
        int n = a * 6 + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n)
                    System.out.print("* ");
                else if (i == 1 + n / 2 && j == 1 + n / 2)
                    System.out.print("* ");
                else if (i >= (n - 9) && i <= (n - 3) && j >= (n - 9) && j <= (n - 3)) {
                    if (i >= (n - 8) && i <= (n - 4) && j <= (n - 4) && j >= n - 8)
                        System.out.print("  ");
                    else
                        System.out.print("* ");

                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}