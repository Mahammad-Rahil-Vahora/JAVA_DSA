package Strings;

public class IsSubsequence {
    static void main(String[] args) {
        String s = "abc";
        String t = "ahbdgc";
        // true
        boolean ans = check(s,t);
        System.out.println(ans);
    }

    public static boolean check (String s, String t){
        int i = 0;
        int j = 0;

        int n = s.length();
        int m = t.length();

        while (i < n && j < m){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return i == s.length();

    }
}
