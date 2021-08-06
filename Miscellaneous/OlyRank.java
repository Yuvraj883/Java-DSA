/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scn = new Scanner (System.in); 
		int t = scn.nextInt(); 
		while (t>0){
		    int g1 = scn.nextInt(); 
		    int s1 = scn.nextInt(); 
		    int b1 = scn.nextInt(); 
		    int g2 = scn.nextInt(); 
		    int s2 = scn.nextInt(); 
		    int b2 = scn.nextInt(); 
		    int T1 = s1+g1+b1; 
		    int T2 = s2+g2+b2; 
		 int ans =   (T1>T2)?1:2; 
		 System.out.println(ans); 
		    t--;
		    
		}
		scn.close();
	}
}
