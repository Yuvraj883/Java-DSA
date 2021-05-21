import java.util.*; 
public class PrintMazePaths{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        int n = scn.nextInt(); 
        int m = scn.nextInt(); 
        printMazePath(0,0, n-1, m-1, "");
        scn.close();
    }

    public static void printMazePath(int sr, int sc ,int dr, int dc, String ans ){
        if (dc ==sc && dr == sr){
        System.out.println(ans); 
        return ;
        } 
        if(dc<sc ||  dr<sr){
            return;
        }
        if(dr == sr && dc == sc){
            System.out.println(ans);
            return;
        }
        printMazePath(sr, sc+1, dr, dc,ans+"h");
        printMazePath(sr+1, sc, dr, dc, ans+"v");  

    }
}