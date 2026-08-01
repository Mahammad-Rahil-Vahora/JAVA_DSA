package Strings;

public class FirstUniqueCharacterInString {
    static void main(String[] args) {
        String s = "leetcode";
        //0
        // "aabb"
        //-1

        int ans = findFirstUnique(s);
        System.out.println(ans);
    }

    public static int findFirstUnique (String s) {

        int [] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            freq[index]++;
        }
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if(freq[index] == 1) {
                return i;
            }
        }
        return -1;
    }
}
