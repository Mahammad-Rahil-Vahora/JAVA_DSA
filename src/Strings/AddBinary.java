package Strings;

public class AddBinary {
    public static void main(String[] args) {

        String num1 = "1010";
        String num2 = "1011";

        // METHOD 1
        int n = num1.length();
        int m = num2.length();

        int size = Math.max(n, m) + 1;
        int[] ans = new int[size];

        int carry = 0;
        int i = n - 1;
        int j = m - 1;
        int k = size - 1;

        while (i >= 0 || j >= 0) {

            char ch1 = (i >= 0) ? num1.charAt(i) : '0';
            char ch2 = (j >= 0) ? num2.charAt(j) : '0';

            if (ch1 == '0' && ch2 == '0' && carry == 0) {
                ans[k] = 0;
                carry = 0;
            }
            else if (ch1 == '1' && ch2 == '1' && carry == 1) {
                ans[k] = 1;
                carry = 1;
            }
            else if ((ch1 == '1' && ch2 == '0' && carry == 0)
                    || (ch1 == '0' && ch2 == '1' && carry == 0)
                    || (ch1 == '0' && ch2 == '0' && carry == 1)) {
                ans[k] = 1;
                carry = 0;

            }
            else if ((ch1 == '1' && ch2 == '0' && carry == 1)
                    || (ch1 == '0' && ch2 == '1' && carry == 1)
                    || (ch1 == '1' && ch2 == '1' && carry == 0)) {
                ans[k] = 0;
                carry = 1;
            }
            i--;
            j--;
            k--;
        }

        if (carry == 1) {
            ans[k] = 1;
        }

        StringBuilder result = new StringBuilder();

        for (int x : ans) {
            if (result.length() != 0 || x != 0) {
                result.append(x);
            }
        }

        if (result.length() == 0)
            System.out.println("0");
        else
            System.out.println(result);




        //METHOD 2
//        int n = num1.length();
//        int m = num2.length();
//
//        int[] ans = new int[n + m];
//
//        int i = n - 1;
//        int j = m - 1;
//        int k = n + m - 1;
//
//        int carry = 0;
//
//        while (i >= 0 || j >= 0) {
//
//            int bit1 = 0;
//            int bit2 = 0;
//
//            if (i >= 0)
//                bit1 = num1.charAt(i) - '0';
//
//            if (j >= 0)
//                bit2 = num2.charAt(j) - '0';
//
//            int sum = bit1 + bit2 + carry;
//
//            ans[k] = sum % 2;
//            carry = sum / 2;
//
//            i--;
//            j--;
//            k--;
//        }
//
//        if (carry == 1) {
//            ans[k] = 1;
//        }
//
//        StringBuilder result = new StringBuilder();
//
//        for (int ele : ans) {
//            if (result.length() != 0 || ele != 0) {
//                result.append(ele);
//            }
//        }
//
//        if (result.length() == 0) {
//            System.out.println("0");
//        } else {
//            System.out.println(result);
//        }
    }
}

