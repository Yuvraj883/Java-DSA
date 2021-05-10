import java.util.*;
public class MaxOfArray{
    public static int maxOfArray(ArrayList<Integer> list, int n){
      if (list.size()-1== n){
          return list.get(n);
      }
      int max = maxOfArray(list, n+1); 
      if(max>list.get(n)){
          return max; 
      }
      else {
          return list.get(n); 
      }

    }
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in ); 
        int n = scn.nextInt(); 
        ArrayList<Integer> list = new ArrayList<>(); 
        for (int i=0; i<n; i++){
            int val = scn.nextInt(); 
            list.add(val); 
        }
      int max=  maxOfArray(list, 0); 
      System.out.println(max); 
      scn.close(); 
    }
}