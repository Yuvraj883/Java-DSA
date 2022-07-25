import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

static int H,B;
static boolean flag; 

static {
    Scanner scn = new Scanner(System.in); 
    B= scn.nextInt(); 
    H = scn.nextInt();
    flag=true;
    scn.close(); 
    
    try{
        if(H<=0 || B<=0){
            flag =false;
            throw new Exception("Breadth and height must be positive"); 
        }
    }
        catch(Exception e){
            System.out.println(e);  
        }
    }


//Write your code here

public static void main(String[] args){