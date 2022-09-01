import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest =  s.substring(0,k);
        
        for (int i=0; i<=s.length()-k; i++){
            String ss = s.substring(i, k+i);
            if(ss.compareTo(smallest)<0){
                smallest = ss; 
            }
            if(ss.compareTo(largest)>0){
             largest = ss;    
            }
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}