package GFG.String;

import java.util.Arrays;

public class AnagramsString {
    static void main(String[] args) {
        String s = "race";
        String t = "caer";

        boolean ans = checkAnagram(s,t);
        System.out.println(ans);
    }

    public static boolean checkAnagram (String s,String t) {
        if (s.length() != t.length()) return false;

        char [] s1 = s.toCharArray();
        char [] t1 = s.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);

        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != t1[i]) return false;
        }
        return true;
    }
}
