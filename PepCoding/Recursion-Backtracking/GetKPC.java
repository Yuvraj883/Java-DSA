import java.util.*;

public class GetKPC {
    static String[] Codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> ans = new ArrayList<>();
        ans = getKPC(str);
        System.out.println(ans);
        scn.close();
    }

    public static ArrayList<String> getKPC(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> ans = new ArrayList<>();
        String codeForCh = Codes[ch - '0'];
        for (int i = 0; i < codeForCh.length(); i++) {
            char j = codeForCh.charAt(i);
            for (String k : rres) {
                ans.add(j + k);
            }
        }
        return ans;

    }
}