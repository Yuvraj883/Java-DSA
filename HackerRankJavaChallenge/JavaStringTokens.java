import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        // String[] arrayOfString = s.replaceAll(","," ").split("[' '!._,?'@'[,] ]");
        //  String[] arrayOfString = s.split("\\w+");
        ArrayList<String> arr = new ArrayList<String>();
          String temp="";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
          
            if(ch==' '|| ch=='!'|| ch==',' || ch=='@' || ch=='?' || ch==39){
             if( temp!=""){
                   arr.add(temp);
                temp="";
             }
               
              
                
               
            }
            else{
                 
                temp += ch;
            }
        }
        // System.out.println(arrayOfString.length); 
        // for(int i =0; i<arrayOfString.length; i++) {
        //     System.out.println(arrayOfString[i]);
        // }
        System.out.println(arr.size());
        for(int i=0; i<arr.size();i++ ){
            System.out.println(arr.get(i));
        }
        scan.close();
    }
}

