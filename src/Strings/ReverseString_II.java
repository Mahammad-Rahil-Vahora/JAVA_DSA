package Strings;

public class ReverseString_II {
    static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        // bacdefg

        StringBuilder sb = new StringBuilder(s);

        int n = sb.length();

        int i = 0;
        int j = k-1;

        while (i <= j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);

            sb.setCharAt(i,ch2);
            sb.setCharAt(j,ch1);
            i++;
            j--;
        }
        System.out.println(sb);
    }
}
