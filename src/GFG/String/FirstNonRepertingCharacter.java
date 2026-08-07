package GFG.String;

public class FirstNonRepertingCharacter {
    static void main(String[] args) {
        String s = "leetcode";
        char ans = firstChar(s);
        System.out.println(ans);
    }

    public static char firstChar(String s) {

        int [] freq = new int [26];

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            freq[index]++;
        }

        char ans = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = ch - 'a';

            if(freq[index ] == 1){
                ans = s.charAt(i);
                break;
            }
        }
        return ans;
    }
}
