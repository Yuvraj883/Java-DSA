import java.util.*;

public class RatInAMaze {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][n];
        mazePath(arr, n, 0, 0, "", visited);
        scn.close();
    }

    public static void mazePath(int[][] maze, int n, int row, int col, String ans, boolean[][] visited) {
        if (row == n - 1 && col == n - 1) {
            System.out.println(ans);
            return;
        }

        if (row < 0 || col < 0 || row >= n || col >= n || maze[row][col] == 0|| visited[row][col] == true) {
            return;
        }
        visited[row][col] = true;
        mazePath(maze, n, row - 1, col, ans + "T", visited);
        mazePath(maze, n, row, col - 1, ans + "L", visited);
        mazePath(maze, n, row + 1, col, ans + "D", visited);
        mazePath(maze, n, row, col + 1, ans + "R", visited);
        visited[row][col] = false;

    }
}