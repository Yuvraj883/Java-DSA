import java.util.*; 
public class PalindromeString{
  public static boolean isPalindrome(String str){
        int i=0; 
        int j= str.length()-1;
        while (i<=j){
            if (str.charAt(i)!=str.charAt(j)){
                return false; 
            }
            else {
                i++; 
                j--;
            }
        }
        return true; 
    }
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        String str = scn.next(); 
        for (int i =0; i<str.length(); i++){
            for (int j=i+1; j<=str.length(); j++){
                String temp = str.substring(i, j);
                if (isPalindrome(temp)==true){
                    System.out.println(temp);
                }
            }
        }
        scn.close();
    }
}