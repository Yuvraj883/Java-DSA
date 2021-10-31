import java.util.*; 
public class ClimbStairs{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        int n = scn.nextInt(); 
        ArrayList<String> container = new ArrayList<>();
       int ans = climbStairs(n, "", 0,container);
       System.out.println(ans);
        scn.close();
    }
    static int count =0;
    public static int climbStairs(int n, String ans , int current,ArrayList<String>container){
        if (n==current ){
           container.add(ans+"");
           
            return container.size();
        }
        else if(current>n){
            return container.size();
        }
        
        climbStairs(n, ans+"1",current+1 , container); 
        climbStairs(n, ans+"2", current+2, container); 
        climbStairs(n, ans+"3", current+3, container); 
        return container.size();
    }
}