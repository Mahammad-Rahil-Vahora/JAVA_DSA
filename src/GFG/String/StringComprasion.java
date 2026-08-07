package GFG.String;

import java.util.Arrays;

public class StringComprasion {
    static void main(String[] args) {
        String s ="abcaab";
        char [] ch = s.toCharArray();
        Arrays.sort(ch);
        String str = new String(ch);

        String ans = comprsion(str);
        System.out.println(ans);
    }

    public static String comprsion(String s){
        int n = s.length();
        String ans  = "";
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (i + 1 < n && s.charAt(i) == s.charAt(i + 1)) count++;
            else {
                ans += s.charAt(i);
                ans += count;
                count = 1;
            }
        }
        return ans;
    }
}
