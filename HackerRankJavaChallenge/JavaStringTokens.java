import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String [] strArr = s.split("[!,?._'@ ' ']+");
        System.out.println(strArr.length);
        for(String temp : strArr){
            System.out.println(temp);
        }
        scan.close();
    }
}

