package Strings;

public class  PalindromeNumber {
    static void main(String[] args) {
        int num = 121;
        int n = num;
        int rev = 0;

        if (n < 0) System.out.println("false");

        while (n > 0) {
            int ld = n % 10;
            rev = rev * 10 + ld;
            n /= 10;
        }
        if (num == rev) System.out.println("true");
        else System.out.println("false");
    }
}
