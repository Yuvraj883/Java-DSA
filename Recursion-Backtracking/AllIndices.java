import java.util.*;

public class AllIndices {
    public static int[] allIndices(int[] arr, int idx, int x, int fsf) {
        if (arr.length == idx) {
            return new int[fsf];
        }
        if (arr[idx] == x) {
            int[] iarr = allIndices(arr, idx + 1, x, fsf + 1);
            iarr[fsf] = idx;
            return iarr;
        } else {
            int[] iarr = allIndices(arr, idx + 1, x, fsf);
            return iarr;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int[] iarr = allIndices(arr, 0, x, 0);
        if (iarr.length == 0) {
            System.out.println();
            return;
        }
        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i]);
        }
        scn.close();
    }
}
