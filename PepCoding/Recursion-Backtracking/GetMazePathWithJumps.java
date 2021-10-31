import java.util.*; 
public class GetMazePathWithJumps{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        int n = scn.nextInt(); 
        int m = scn.nextInt(); 
        ArrayList<String> ans = new ArrayList<> (); 
        ans = getMazePathWithJumps(1 , 1, n,m);
        System.out.println(ans);
        scn.close();
    }

    public static ArrayList<String> getMazePathWithJumps(int sr , int sc , int dr , int dc){
      
        if( sr ==dr && sc == dc){
            ArrayList <String> bres = new ArrayList<>();
            bres.add(""); 
            return bres; 
        }

        ArrayList<String> ans = new ArrayList<>();
        //horizontal paths
        for (int ms =1; ms<=dc-sc; ms++ ){
            ArrayList<String> hpaths = getMazePathWithJumps(sr , sc+ms, dr, dc); 
            for (String hpath: hpaths){
                ans.add("h"+ms+hpath);
            }
        }

        //vertical paths
        for (int ms =1; ms<=dr-sr; ms++){
            ArrayList<String> vpaths = getMazePathWithJumps(sr+ms, sc , dr , dc);
            for (String vpath : vpaths){
                ans.add("v"+ ms + vpath);
            }
        }

        //diagonal paths
        for(int ms =1; ms<=dr-sr && ms<= dc-sc ; ms++){
            ArrayList<String> dpaths = getMazePathWithJumps(sr+ms, sc+ms, dr, dc); 
            for (String dpath : dpaths){
                ans.add("d"+ms+dpath);
            }
        }
        return ans ; 
    }
}