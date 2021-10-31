import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();

        }
        bubbleSort(arr);
        scn.close();

    }

    // swap two numbers
    public static void swap(int[] arr, int j, int k) {
        System.out.println("Swapping " + arr[k] + " and " + arr[j]);
        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
    }

    // Check if arr[j+1] is smaller than arr[j]
    public static boolean isSmaller(int[] arr, int j, int k) {
        System.out.println("Comparing " + arr[k] + " and " + arr[j]);
        if (arr[j] > arr[k]) {
            return true;
        } else {
            return false;
        }
    }

    // Bubble sort algo
    public static void bubbleSort(int[] arr) {
        for (int i = 1; i <arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (isSmaller(arr, j, j+1)) {
                    swap(arr, j, j + 1);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}