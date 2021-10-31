import java.util.*;

public class StateOfWakanda2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();//sides of the square matrix
    
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        for (int g = 0; g < arr.length; g++) {
            for (int i = 0, j = g; j < arr[0].length;i++ ,j++) {
                System.out.println(arr[i][j]);
            }
        }
        scn.close();
    }
}