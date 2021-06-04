import java.util.*;

public class ClimbStairsTabulation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
       int ans = stairPaths(n);
       System.out.println(ans);
       scn.close();
    }

    public static int stairPaths(int n) {
        int[] tab = new int[n + 1];
        tab[0] = 1;
        for (int i = 1; i < n; i++) {
            if (i == 1) {
                tab[i] = tab[i - 1];

            } else if (i == 2) {
                tab[i] = tab[i - 1] + tab[i - 2];
            } else {
                tab[i] = tab[i - 1] + tab[i - 2] + tab[i - 3];
            }
        }
        return tab[n-1];
    }
}