package Strings;

public class LongestCommonPrefix {
    static void main(String[] args) {
        String [] strs = {"flower", "flow", "flight"};
        // "fl"

        String first = strs[0];

        for (int i = 0; i < first.length(); i++) {

            char ch = first.charAt(i);

            for (int j = 1; j < strs.length; j++) {

                if (i == strs[j].length() || strs[j].charAt(i) != ch) {
                    first = first.substring(0, i);
                    break;
                }
            }
        }
        System.out.println(first);
    }
}
