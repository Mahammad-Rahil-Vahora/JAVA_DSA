package GFG.String;

public class CheckStringIsPalindromeOrNot {
    static void main(String[] args) {
        String s = "madam";
        boolean ans = check(s);
        System.out.println(ans);
    }

    public static boolean check (String s) {
        int n = s.length();
        int i = 0;
        int j = n-1;

        while (i <= j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
