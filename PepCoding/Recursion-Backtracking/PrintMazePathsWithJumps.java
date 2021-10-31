import java.util.*; 
public class PrintMazePathsWithJumps{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        int n = scn.nextInt(); 
        int m = scn.nextInt(); 
        mazePathsWithJumps(0, 0, n-1, m-1,""); 
        scn.close();
    }

    public static void mazePathsWithJumps(int sr, int sc , int dr, int dc, String ans){
        if (dc == sc && dr == sr){
            System.out.println(ans); 
            return ;
        }
       

       //Horizontal Paths
        for (int ms =1; ms<=dc-sc; ms++){
            mazePathsWithJumps(sr, sc+ms, dr, dc, ans+"h"+ms);
        }

        // Vertical Paths
        for (int ms =1; ms<=dr-sr; ms++){
            mazePathsWithJumps(sr+ms, sc, dr, dc, ans+"v"+ms);
        }

        //Diagonal paths
        for (int ms =1; ms<=dc-sc && ms<=dr-sr; ms++){
            mazePathsWithJumps(sr+ms, sc+ms, dr, dc, ans+"d"+ms);
        }
    }
}