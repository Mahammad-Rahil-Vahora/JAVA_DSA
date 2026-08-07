package Strings;

public class RepeatedSubstringPattern {
    static void main(String[] args) {
        String s = "abab";
        //true
        // String s = "aba";
        //false
        // String s = "abcabcabcabc";
        //true

        boolean ans = repeatedSubstringPattern(s);
        System.out.println(ans);
    }
    public static boolean repeatedSubstringPattern(String s) {

        int n = s.length();

        for (int len = 1; len <= n / 2; len++) {
            if (n % len != 0) {
                continue;
            }

            String sub = s.substring(0, len);
            String ans = "";

            for (int i = 0; i < n / len; i++) {
                ans += sub;
            }
            if (ans.equals(s)) {
                return true;
            }
        }
        return false;
    }
}
