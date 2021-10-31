import java.util.*; 
public class GetStairPaths{ 
    public static void main(String[] args){ 
        Scanner scn = new Scanner (System.in); 
        int n = scn.nextInt(); 
        ArrayList<String> ans = getStairPaths(n); 
        System.out.println(ans);
        scn.close();
    }

    public static ArrayList<String> getStairPaths(int n){ 
        if (n==0){
            ArrayList<String> bres = new ArrayList<> ();
            bres.add (""); 
            return bres; 
        }
        else if (n<0){
            ArrayList<String> bres = new ArrayList<> (); 
            return bres; 
        }

        ArrayList<String> Path1 = getStairPaths(n-1); 
        ArrayList<String> Path2 = getStairPaths(n-2); 
        ArrayList<String> Path3 = getStairPaths(n-3); 
        
        ArrayList <String> ans = new ArrayList<>(); 
        for (String path : Path1){
            ans.add(1+path);
        }
        for (String path : Path2){
            ans.add(2+path);
        }
        for (String path : Path3){
            ans.add (3+path);
        }
        return ans; 
    }
}