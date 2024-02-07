//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack <Integer> st = new Stack <>(); 
        
        for(int i=0; i<S.length(); i++){
            char ch = S.charAt(i); 
           if(ch == '+' && st.size()>=2){
               int a = st.pop(); 
               int b = st.pop(); 
               st.push(a+b); 
           }
          else  if(ch == '-' && st.size()>=2){
               int a = st.pop(); 
               int b = st.pop(); 
               st.push(b-a); 
           }
           
          else  if(ch == '*' && st.size()>=2){
               int a = st.pop(); 
               int b = st.pop(); 
               st.push(a*b); 
           }
           else  if(ch == '/' && st.size()>=2){
               
               int a = st.pop(); 
               int b = st.pop(); 
               
               if(b!=0){
                   st.push(b/a);
               }
               else{
                //   st.push(b); 
                //   st.push(a);
                st.push(0);
               }
               
           }
           
          
           
           else {
                int num = Character.getNumericValue(ch); 
                st.push(num); 
           }
           
            
        }
        
        return st.pop(); 
    }
}

