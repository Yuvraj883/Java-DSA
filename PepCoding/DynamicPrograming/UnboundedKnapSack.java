import java.util.*; 
public class Main{
    public static void main(String[]  args){
      Scanner scn = new Scanner (System.in); 
      int n = scn.nextInt(); 
      int [] val = new int [n]; 
      for (int i =0; i<n; i++){
          val[i] = scn.nextInt(); 
      }
      
      int [] wts = new int [n];  
      for (int i =0; i<n; i++){
          wts[i] = scn.nextInt(); 
      }
      int cap = scn.nextInt(); 
      
      int [] dp = new int [cap+1]; 
      for (int bcap =1; bcap<dp.length; bcap++){ 
          int max = 0; 
           for (int j = 0; j<wts.length; j++){
               if (bcap >=wts[j]){
                   int rbcap = bcap - wts[j]; 
                   int rbv = val[j]+ dp[rbcap]; 
                   if(rbv>max){
                       max = rbv; 
                   }
               }
               dp[bcap] = max; 
           }
      }
      System.out.println(dp[cap]); 
      scn.close();
      
    }
}