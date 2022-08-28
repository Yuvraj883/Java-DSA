import java.io.*;
import java.util.*;

class Add{
   void add(int n1, int n2){
       int sum = n1+n2;
        System.out.println(n1+"+"+n2+"="+sum);
    }
   void add(int n1, int n2,int n3){

int sum =n1+n2+n3;
        System.out.println(n1+"+"+n2+"+"+n3+"="+sum);
    }
    void add(int n1, int n2, int n3, int n4, int n5){
        int sum = n1+n2+n3+n4+n5;
        System.out.println(n1+"+"+n2+"+"+n3+"+"+n4+"+"+n5+"="+sum); 
    }
    void add(int n1, int n2, int n3, int n4, int n5, int n6){
        int sum = n1+n2+n3+n4+n5+n6;
        System.out.println(n1+"+"+n2+"+"+n3+"+"+n4+"+"+n5+"+"+n6+"="+sum); 
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in); 
        int n1 = scn.nextInt(); 
        int n2 = scn.nextInt(); 
        int n3 = scn.nextInt(); 
        int n4 = scn.nextInt(); 
        int n5 = scn.nextInt(); 
        int n6 = scn.nextInt(); 
        Add ob = new Add(); 
        ob.add(n1, n2); 
        ob.add(n1, n2, n3); 
        ob.add(n1, n2, n3, n4, n5); 
        ob.add(n1, n2, n3, n4,n5,n6);
         
    }
}
