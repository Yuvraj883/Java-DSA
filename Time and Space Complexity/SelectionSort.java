import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();

        }
        selectionSort(arr);
        for (int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
        scn.close();

    }

    // Selection sort algo
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (isSmaller(arr, j, min)) {
                    min = j;
                }
            }
            swap(arr, i,min);
        }
        
    }
     // Check if arr[min] is greater than arr[j] 
    public static boolean isSmaller(int []arr, int j, int min){
        System.out.println("Comparing "+arr[j]+" and "+ arr[min]); 
        if (arr[j]<arr[min]){
            return true; 

        }
        else{
            return false; 
        }
    }

    //Swap arr[min] and arr[j]
    public static void swap(int [] arr, int i, int min){
        System.out.println("Swapping "+arr[i]+" and "+ arr[min]); 
        int temp = arr[min]; 
        arr[min]= arr[i]; 
        arr[i] = temp; 
    }
}