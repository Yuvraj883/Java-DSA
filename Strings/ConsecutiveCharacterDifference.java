import java.util.*; 
public class ConsecutiveCharacterDifference{
    public static String consecutiveCharacterDifference(String str){
        StringBuilder sb = new StringBuilder() ;
        sb.append(str.charAt(0));
        for(int i=1; i<str.length(); i++){
            char one = str.charAt(i-1);
            char two = str.charAt(i);
            int res = two-one; 
          //  sb.append(one); 
            sb.append(res);
            sb.append(two);
             
        } 
        return sb.toString() ;

    }
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        String str = scn.next(); 
        System.out.println(consecutiveCharacterDifference(str));
        scn.close(); 
    }
}