package Strings;

public class CheckIfSentenceIsPangram {
    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
//      Output: true
//        String s = "leetcode";
//        Output: false
        boolean ans = check(s);
        System.out.println(ans);
    }

    public static boolean check (String s) {
        int n = s.length();
        if(n < 26) {
            return false;
        }

        int [] freq = new int [26];
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int index = ch - 'a';
            freq[index] += 1;
        }

        for (int i = 0; i < 26; i++) {
            if(freq[i] < 1) return false;
        }
        return true;
    }
}
