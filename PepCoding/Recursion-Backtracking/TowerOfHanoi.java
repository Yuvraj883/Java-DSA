import java.util.*;

public class TowerOfHanoi {
    public static void towerOfHanoi(int n, int fromRod, int toRod, int auxRod) {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, fromRod, auxRod, toRod);
        System.out.println(n + "[" + fromRod + " -> " + toRod + "]");
        towerOfHanoi(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        towerOfHanoi(n, a, b, c);
        scn.close();

    }
}