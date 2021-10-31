import java.util.*; 
public class StringCompression{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        String str = scn.next(); 
        String temp = str.charAt(0)+""; 
        for (int i=1; i<str.length(); i++){
            char curr = str.charAt(i); 
            char prev = str.charAt(i-1); 
            if (prev != curr){
                temp += curr; 
            }
        }
        System.out.println(temp); 
        String s = str.charAt(0)+""; 
        int count =1; 
        for (int i=1; i<str.length(); i++){
            char curr = str.charAt(i); 
            char prev = str.charAt(i-1); 
        
            if (curr == prev){
                count++; 
            }
            else {
                if (count>1){
                    s += count; 
                }
                s += curr; 
                count =1;
            }
        }
     if (count>1){
         s += count; 
     }
        System.out.println(s);
        scn.close ();
    }
}