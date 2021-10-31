import java.util.*; 
public class WordBreak{
    public static void main(String [] args){
        Scanner scn = new Scanner (System.in); 
        String str = scn.next(); 
        int n = scn.nextInt(); 
        String [] dict = new String [n]; 
        for (int i=0; i<n; i++){
            dict[i] = scn.next(); 
        }
        boolean [] visited = new boolean [n];
        wordBreak(dict , str, "",n, visited,0); 
        scn.close();
    }

    public static void wordBreak(String[] dict, String str, String ans, int n, boolean[] visited,int idx){
      if(idx == str.length()-1){
          System.out.println(ans); 
      }
      if(visited[idx]== true){
          return ;
      }
        for (String word : dict){
            if (word==ans){            
                ans= ans+" ";
                System.out.println(ans);
            }
        }
        String temp = str.substring(0, idx); 
        visited [idx] = true; 
        wordBreak(dict, str, ans+temp+" ", n, visited, idx+1); 
        visited [idx] = false; 
        idx--;
     
    }
}
