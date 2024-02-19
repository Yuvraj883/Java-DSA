//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
		out.flush();
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        heapify(arr, l, r); 
       
        return arr[l+k-1];
    } 
    public static void sortArray(int []arr, int l, int r){
        r=r+1;
        for(int i=l; i<r; i++){
            for(int j=i; j<r; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i]; 
                    arr[i]=arr[j]; 
                    arr[j]=temp; 
                }
            }
        }
        //  for(int i=l; i<r; i++){
        //     System.out.print(arr[i]+" ");
        // }
    }
    
    public static void heapify(int arr[], int l, int r){
        PriorityQueue<Integer> pq = new PriorityQueue<>(); 
        
        for(int i=l; i<r+1; i++){
            pq.offer(arr[i]); 
        }
        
        for(int i=l; i<r+1; i++){
            arr[i]=pq.poll();
        }
        //   for(int i=l; i<r; i++){
        //     System.out.print(arr[i]+" ");
        // }
    }
}
