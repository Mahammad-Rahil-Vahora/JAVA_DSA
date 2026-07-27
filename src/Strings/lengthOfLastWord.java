package Strings;

public class lengthOfLastWord {
    public static void main (String[] args) {
        String s = "   fiy     me  to the      moonnoom   ";

        int ans = count(s);
        System.out.println(ans);
    }

    public static int count (String s){
//        String [] word = s.trim().split("\\s+");
//        int n = word.length;
//
//        String ans  = word[n-1];
//        return ans.length();

        int n = s.length();
        int i = n-1;
        int count = 0;

        while (i>=0 && s.charAt(i) == ' '){
            i--;
        }

        while (i>=0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }
        return count;
    }
}
