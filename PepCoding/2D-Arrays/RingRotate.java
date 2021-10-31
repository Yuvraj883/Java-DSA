import java.util.*;

public class RingRotate {
    public static void main(String[] argc) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int r = scn.nextInt();
        int s = scn.nextInt();
        shellRotate(arr, s, r);
        display(arr);
    }

    public static void shellRotate(int[][] arr, int s, int r) {
        int[] oneD = filloneDFromShell(arr, s);
        rotate(oneD, r);
        fillShellFromoneD(arr, s);
    }

    public static void rotate(int[] oneD, int r) {
        r = r % oneD.length;
        if (r < 0) {
            r = r + oneD.length;
        }
        reverse(oneD, 0, oneD.length - r - 1);
        reverse(oneD, oneD.length - r - 1, oneD.length - 1);
        reverse(oneD, 0, oneD.length - 1);

    }

    public static void reverse(int[] arr, int li, int ri) {
        while (li <= ri) {
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;
            li++;
            ri--;
        }

    }

    public static int[] filloneDFromShell(int[][] arr, int s) {
        int minr = 0;
        int minc = 0;
        int maxr = s - 1;
        int maxc = s - 1;
        int sz = 2 * (maxr - minr) + 2 * (maxc - minc);
        int[] oneD = new int[sz];
        int idx = 0;
        // left wall
        for (int i = minr; i < maxr; i++) {
            oneD[idx] = arr[i][minc];
            idx++;
        }
        minc++;
        // bottom wall
        for (int i = minc; i < maxc; i++) {
            oneD[idx] = arr[maxr][i];
            idx++;

        }
        maxr--;
        // right wall
        for (int i = maxr; i > minr; i--) {
            oneD[idx] = arr[i][maxc];
            idx++;

        }
        maxc--;
        // top wall
        for (int i = maxc; i > minc; i--) {
            oneD[idx] = arr[minr][i];
            idx++;

        }
        return oneD;
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fillShellFromoneD(int[][] arr, int s) {
        int minr = 0;
        int minc = 0;
        int maxr = s - 1;
        int maxc = s - 1;
        int sz = 2 * (maxr - minr) + 2 * (maxc - minc);
        int[] oneD = new int[sz];
        int idx = 0;
        // left wall
        for (int i = minr; i < maxr; i++) {
            arr[i][minc] = oneD[idx];

            idx++;
        }
        minc++;
        // bottom wall
        for (int i = minc; i < maxc; i++) {
            arr[maxr][i] = oneD[idx];

            idx++;

        }
        maxr--;
        // right wall
        for (int i = maxr; i > minr; i--) {
            arr[i][maxc] = oneD[idx];

            idx++;

        }
        maxc--;
        // top wall
        for (int i = maxc; i > minc; i--) {
            arr[minr][i] = oneD[idx];

            idx++;

        }
    }
}