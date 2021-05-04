import java.util.*; 
public class ToggleCase{
    public static String toggleCase(String str){
        StringBuilder sb = new StringBuilder(str);
        for (int i=0; i<sb.length(); i++){
            char ch = sb.charAt(i); 
            if (ch>='a' && ch <='z'){
                char upc = (char)(ch -'a' +'A');
                sb.setCharAt(i, upc);
            }
            else if (ch>='A' && ch<='Z') {
                char lwc = (char)(ch-'A'+'a');
                sb.setCharAt(i, lwc);
            }
        }
        return sb.toString(); 
    }
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        String str = scn.next(); 
        toggleCase(str);
        System.out.println(toggleCase(str));
        scn.close();
    }
}