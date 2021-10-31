import java.util.*;

public class DifferenceOfTwoArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scn.nextInt();
        }

        int m = scn.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = scn.nextInt();

        }

        int[] diff = new int[n > m ? n : m];
        int i = n - 1;
        int j = m - 1;
        int k = diff.length - 1;
        int c = 0;
        while (k >= 0) {
            int d = 0;
            if (i >= 0) {
                d += arr1[i];
            }

            else {
                d += 0;
            }
            if (arr2[j] + c >= d) {
                d = arr2[j] - d + c;
                c = 0;
            } else {
                d = arr2[j] - d + 10 + c;
                c = -1;
            }
            diff[k] = d;

            i--;
            j--;
            k--;

        }
        int idx = 0;
        while (idx < diff.length) {
            if (diff[idx] != 0) {
                break;
            } else {
                idx++;
            }
        }
        while (idx < diff.length) {
            System.out.print(diff[idx]);

            idx++;
        }
        System.out.println();
        scn.close();
    }
}