import java.util.*; 
public class PrintPermutations{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in); 
        String str = scn.next(); 
        printPermutations(str, "");
        scn.close();
    }

    public static void printPermutations(String ques, String ans){
        if (ques.length()==0){
            System.out.println(ans); 
            return ;
        }
        for (int i=0; i<ques.length(); i++){
            char ch = ques.charAt(i); 
            String lques = ques.substring(0,i); 
            String rques = ques.substring(i+1);
            String roq = lques+rques;
            printPermutations(roq, ans+ch);
        }
    }
}