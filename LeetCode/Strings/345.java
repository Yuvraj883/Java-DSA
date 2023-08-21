class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int begin = 0;
        int end = s.length() - 1;

        while (begin < end) {
            char chBegin = sb.charAt(begin);
            char chEnd = sb.charAt(end);

            if (!isVowel(chBegin)) {
                begin++;
            } else if (!isVowel(chEnd)) {
                end--;
            } else {
                sb.setCharAt(begin, chEnd);
                sb.setCharAt(end, chBegin);
                begin++;
                end--;
            }
        }
        return sb.toString();
    }

    public boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}
