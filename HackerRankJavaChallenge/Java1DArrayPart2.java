import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {   
                  
        // Return true if you can win the game; otherwise, return false.
        return isSolvable(game,leap , 0);
        
    }
    public static boolean isSolvable(int[]game, int leap, int index){
        if(index>=game.length-1){
            return true;
        }
        if(index<0 || game[index]==1){
            return false;
        }
        game[index]=1;
        return isSolvable(game, leap, index+leap)|| isSolvable(game,leap, index+1)||isSolvable(game,leap, index-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
