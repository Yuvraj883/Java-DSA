//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //Taking input using class Scanner
		Scanner sc=new Scanner(System.in);
		
		//Taking total count of testcases
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    
		    int n,m;
		    
		    //taking size of array a
		    n=sc.nextInt();
		    
		    //taking size of array b
		    m=sc.nextInt();
		    
		    //Creating 2 array of size n and m
		    int a[]=new int[n];
		    int b[]=new int[m];
		    
		    //inserting elements to array a
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    
		    //inserting elements to array b
		    for(int i=0;i<m;i++)
		    {
		        b[i]=sc.nextInt();
		    }
		    Solution ob=new Solution();
		    //calling doUnion method and printing the results
		    System.out.println(ob.doUnion(a,n,b,m));
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        int max = Integer.MIN_VALUE; 
        
        for(int i=0; i<n; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        
        for(int i=0; i<m; i++){
            if(b[i]>max){
                max = b[i];
            }
        }
        
        int frequency[] = new int[max+1]; 
        ArrayList<Integer> union= new ArrayList<>();
        
        for(int i = 0; i<n; i++){
            frequency[a[i]]++ ;
        }
        for(int i=0; i<m; i++){
            frequency[b[i]]++; 
        }
        int j = 0; 
        for(int i=0; i<max+1; i++){
            if(frequency[i]>0){
                union.add(i); 
                j++; 
            }
        }
        return j;  
    }
}