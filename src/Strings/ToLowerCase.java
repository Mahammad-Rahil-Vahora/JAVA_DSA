package Strings;

public class ToLowerCase {
    public static void main (String[] args) {
        String s = "HellO Java";
        String ans = change(s);
        System.out.println(ans);
    }
    public static String change (String s) {
        int n = s.length();
        String ans = "";

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                ans += (char)(ch + 32);
            }
            else {
                ans += ch;
            }
        }
        return ans;
    }
}
