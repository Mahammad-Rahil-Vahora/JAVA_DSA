package Strings;

public class IntegerToRoman {
    static void main(String[] args) {

        int num = 1994;

        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < value.length; i++) {

            while (num >= value[i]) {
                ans.append(roman[i]);
                num -= value[i];
            }
        }
//        int x = 0;
//        String ans = "";
//
//        while(num > 0) {
//            if (num > 1000) x = num / 1000;
//            else if (num > 100)   x = num / 100;
//            else if (num > 10)   x = num / 10;
//            else if (num > 0 && num < 10)   x = num ;
//
//            if(num >= 1000) {
//                num -= 1000;
//                ans += 'M';
//            }
//            else if (num >= 500 && num < 1000) {
//                if(x == 9) {
//                    num -= 900;
//                    ans += "CM";
//                }else {
//                    num -= 500;
//                    ans += 'D';
//                }
//            }
//            else if (num >= 100 && num < 500) {
//                if(x == 4) {
//                    num -= 400;
//                    ans += "CD";
//                }else {
//                    num -= 100;
//                    ans += 'C';
//                }
//            }
//            else if (num >= 50 && num < 100) {
//                if(x == 9) {
//                    num -= 90;
//                    ans += "XC";
//                }else {
//                    num -= 50;
//                    ans += 'L';
//                }
//            }
//            else if (num >= 10 && num < 50) {
//                if(x == 4) {
//                    num -= 40;
//                    ans += "XL";
//                }else {
//                    num -= 10;
//                    ans += 'X';
//                }
//            }else if (num >= 5 && num < 10) {
//                 if(x == 9) {
//                    num -= 9;
//                    ans += "IX";
//                 }else {
//                    num -= 5;
//                    ans += 'V';
//                 }
//            }
//            else if (num >= 1 && num < 5) {
//                if(x == 4) {
//                    num -= 4;
//                    ans += "IV";
//                }else {
//                    num -= 1;
//                    ans += 'I';
//                }
//            }
//        }
        System.out.println(ans);
    }
}
