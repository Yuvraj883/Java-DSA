import java.util.*; 
public class GetMazePaths{
  
    
        public static ArrayList<String> getMazePaths(int sc,int sr, int dc, int dr){
            if(dc<sc || dr <sr){
              
                return new ArrayList<>();
            }
            if(dr == sr && dc == sc){
                ArrayList<String> bres = new ArrayList<>(); 
                bres.add("");
                return bres; 
            }
           
                ArrayList<String> hpaths = getMazePaths(sc+1, sr, dc, dr);
        
            
                ArrayList<String> vpaths = getMazePaths(sc, sr+1, dc ,dr); 
    

            ArrayList<String> ans = new ArrayList<>(); 
            for (String path: hpaths){
                ans.add('h'+path);
            }
            for (String path: vpaths){
                ans.add('v'+path);
            }
            return ans ;
        }
        public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt(); 
        int m = scn.nextInt(); 
        ArrayList<String> ans = getMazePaths(0,0,m-1,n-1);
        System.out.println(ans);
        scn.close();
    }
}