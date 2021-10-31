import java.util.*;

public class GetSubsequences {
    public static ArrayList<String> getSubsequences(String str) {
        if (str.length() == 0) {
            ArrayList<String> bstr = new ArrayList<>();
            bstr.add("");
            return bstr;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = getSubsequences(ros);
        ArrayList<String> ans = new ArrayList<>();
        for (String i : rres) {
            ans.add(i);

        }
        for (String i : rres) {
            ans.add(ch + i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(getSubsequences(str));
        scn.close(); 
    }
}