import java.util.*;

public class PrintStairPaths{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printStairPaths(n, "");
        scn.close();

    }

    public static void printStairPaths(int n, String ans) {
        if (n < 0) {
            return;
        } else if (n == 0) {
            System.out.println(ans);
            return;
        }
        printStairPaths(n - 1,ans+"1");
        printStairPaths(n - 2, ans+"2");
        printStairPaths(n - 3, ans+"3");

    }
}