package Strings;

public class MultiplyStrings {
    static void main(String[] args) {
        String num1 = "123";
        String num2 = "45";

        int n = num1.length();
        int m = num2.length();

        if (num1 == "0" || num2 == "0") System.out.println("0");

        int [] ans = new int[n+m];

        for (int i = n-1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            for (int j = m-1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';

                int mul = digit1 * digit2;
                int sum = mul + ans[i+j+1];

                ans[i+j+1] = sum % 10;
                ans[i+j] = sum / 10;
            }
        }

        StringBuilder result = new StringBuilder();

        for(int ele : ans){
            if(result.length() != 0 || ele != 0) result.append(ele);
        }
        System.out.println(result);
    }
}
