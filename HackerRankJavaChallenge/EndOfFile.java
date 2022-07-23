import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int line_num =  1; 
        while(scn.hasNext()){
            System.out.println(line_num++ +" "+scn.nextLine());
        }
        scn.close();
            }
}
