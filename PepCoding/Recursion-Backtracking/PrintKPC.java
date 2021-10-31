import java.util.*; 
public class PrintKPC{
    static String[] Codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        String str = scn.next(); 
        printKPC(str, "");
        scn.close();

    }
public static void printKPC(String ques, String ans){
    
    if (ques.length()==0){
        System.out.println(ans); 
        return ;
    }
    char ch = ques.charAt(0);
    String roq = ques.substring(1); 
    String CodesOfCh = Codes[ch - '0'];
    for (int i=0; i<CodesOfCh.length(); i++){
        char cho = CodesOfCh.charAt(i); 
        printKPC(roq, ans+cho); 
    }

    }
}