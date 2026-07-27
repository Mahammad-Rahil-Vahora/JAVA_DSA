package Strings;

public class ValidPalindrome {
    static void main(String[] args) {
        String s = "A, bcd ef'f edc ba";
        //true
        s = s.toLowerCase();
        System.out.println(s);

        int n = s.length();

        int i = 0;
        int j = n-1;

        while(i <= j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);

            if ((ch1 < 'a' || ch1 > 'z') && (ch1 < '0' || ch1 > '9')) {
                i++;
                continue;
            }
            if ((ch2 < 'a' || ch2 > 'z') && (ch2 < '0' || ch2 > '9')) {
                j--;
                continue;
            }
            if (ch1 != ch2) {
                System.out.println(false);
                return;
            }

            i++;
            j--;

        }
        System.out.println(true);
    }
}
