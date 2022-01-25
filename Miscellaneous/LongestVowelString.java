import java.io.*;
//import java.util.*;


 class LongestVowelString{
    static boolean isVowel(char c){
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
}
    public static int solve(String s){
    int len = s.length();
    int start = 0, end = len - 1;
    while(start < len && isVowel(s.charAt(start))) ++start;
    while(end >= 0 && isVowel(s.charAt(end))) --end;
    // checking area come to [start, end]
    if(start >= len) return len;
    int res = start + len - 1 - end;
    int longest = 0, sum = 0;
    for(int i = start + 1; i <= end; ++i){
        if(isVowel(s.charAt(i)))
            ++sum;
        else
            sum = 0;
        longest = Math.max(sum, longest);
    }
    return longest + res;
}
public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter wr = new PrintWriter (System.out);
    int T = Integer.parseInt(br.readLine().trim());
    for(int t_i=0 ; t_i< T;t_i++)
    {
        String s = br.readLine();
        
        int out_ = solve(s);
        System.out.println(out_);
    }
    
    wr.close();
    br.close();
}
}