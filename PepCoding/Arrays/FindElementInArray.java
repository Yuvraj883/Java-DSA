import java.util.*;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int d = scn.nextInt();
        int bool = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == d) {
                bool = i;
                break;
            }
        }

        System.out.println(bool);
        scn.close();

    }
}