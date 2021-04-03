import java.util.*;

public class RotateArray{
    public static void Reverse(int[] arr, int li, int ri) {
        while (li < ri) {
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;
            li++;
            ri--;
        }

    }

    public static void main(String[] argc) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        k = k%n;
        if (k<0){
            k = k+arr.length;
        }
        Reverse(arr, 0, arr.length - k - 1);
        Reverse(arr, arr.length - k , arr.length - 1);
        Reverse(arr, 0, arr.length - 1);

        for (int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        scn.close();
    }
}