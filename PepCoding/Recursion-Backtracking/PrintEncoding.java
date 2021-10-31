import java.util.*; 
public class PrintEncoding{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        String str = scn.next(); 
        printEncodings(str, ""); 
        scn.close(); 
    }

    public static void printEncodings(String ques, String ans ){
        if (ques.length()==0){
            System.out.println(ans);
            return ; 
        }
        else if(ques.length()==1){
            if (ques.charAt(0)=='0'){
                return ; 
            }
            else{
                char ch = ques.charAt(0); 
                int chv = ch -'0'; //Integer equivalent of ch
                char code = (char) ('a'+ chv - 1); 
                ans = ans+code; 
                System.out.println(ans); 
            }
        }
        else{
            char ch = ques.charAt(0); 
            String roq = ques.substring(1); 

            if (ch == '0'){
                return ; 
            }
            else{
              int chv = ch -'0'; 
              char code = (char)('a'+chv-1); 
              printEncodings(roq, ans +code); 
                }
                String ch12 = ques.substring(0, 2); 
                String roq12 = ques.substring (2); 
                int ch12v = Integer.parseInt(ch12); //Integer equivalent of String
                if(ch12v <=26 ){
                    char code =(char) ('a'+ch12v-1); 
                    printEncodings(roq12, ans+code); 
            }

        }
    }
}