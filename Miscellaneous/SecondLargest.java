/* package codechef; // don't place package name! */

import java.util.*;
//import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class SecondLargest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scn = new Scanner(System.in); 
		int t=scn.nextInt(); 
		while (t>0){
		    int [] arr = new int[3]; 
		    for (int i =0; i<3; i++){
		        arr[i]=scn.nextInt(); 
		    }
		    
		    Arrays.sort(arr); 
		    System.out.println(arr[1]);
		    t--;
		}
		scn.close();
	}
}
