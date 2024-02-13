//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.findMaxLen(S));
        }
    }
}


// } Driver Code Ends


//User function Template for Java
class Solution {
    static int findMaxLen(String S) {
        // code here
        Stack<Integer> st = new Stack<>(); 
        st.push(-1); 
        
        int count = 0; 
        
        for(int i=0; i<S.length(); i++){
            char ch = S.charAt(i); 
            if(ch == '('){
                st.push(i); 
            }
            else{
                st.pop();
                if(!st.isEmpty()) {
                 
                count = Math.max(count, i-st.peek()); 
               
            }
            else{
                st.push(i); 
            }
         }
        }
        return count; 
    }
};