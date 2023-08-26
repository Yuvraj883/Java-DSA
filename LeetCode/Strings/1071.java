class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        } else {
            return str1.substring(0, gcd(n1, n2));
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
