package Strings;

public class ReverseVowelsOfString {
    static void main(String[] args) {
        String s = "IceCream";
        s = s.toLowerCase();
        // AceCreim
        StringBuilder sb = new StringBuilder(s);
        int n = sb.length();

        int i = 0;
        int j = n-1;

        while (i <= j) {
            char ch1 = sb.charAt(i);
            char ch2 = sb.charAt(j);

            if((ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') && (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u')) {
                char temp1 = ch1;
                char temp2 = ch2;
                sb.setCharAt(i,temp2);
                sb.setCharAt(j,temp1);
                i++;
                j--;
            }
            else if(ch1 != 'a' && ch1 != 'e' && ch1 != 'i' && ch1 != 'o' && ch1 != 'u') i++;
            else if(ch2 != 'a' && ch2 != 'e' && ch2 != 'i' && ch2 != 'o' && ch2 != 'u') j--;
        }
        System.out.println(sb);
        //leetcode
        //leotcede
    }
}

