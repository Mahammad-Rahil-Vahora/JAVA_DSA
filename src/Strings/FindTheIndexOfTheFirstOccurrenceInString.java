package Strings;

public class FindTheIndexOfTheFirstOccurrenceInString {
    static void main(String[] args) {
        String str = "siadbutsad";
        String s = "siad";
        //0

        int ans = check(str,s);
        System.out.println(ans);
    }

//    leetcode
//    leeco
//    -1

    public static int check (String str, String s) {

        int n = str.length();
        int m = s.length();

        for (int i = 0; i < n; i++) {
            int j = 0;
            while (j < m && str.charAt(i+j) == s.charAt(j)) {
                j++;
            }
            if (j == m) return i;
        }
        return -1;
    }

}
