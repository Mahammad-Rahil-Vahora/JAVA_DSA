package Strings;

public class   RomanToInteger {
    static void main(String[] args) {
        String s = "MCMVCIVII";
        // METHOD 1
//        for (int i = 0; i < n; i++) {
//            if(i+1 < n && s.charAt(i) == 'C' && s.charAt(i+1) == 'M') {
//                sum += 900;
//                i++;
//            }
//            else if(i+1 < n && s.charAt(i) == 'C' && s.charAt(i+1) == 'D') {
//                sum += 400;
//                i++;
//            }
//            else if(i+1 < n && s.charAt(i) == 'X' && s.charAt(i+1) == 'C') {
//                sum += 90;
//                i++;
//            }
//            else if(i+1 < n && s.charAt(i) == 'X' && s.charAt(i+1) == 'L') {
//                sum += 40;
//                i++;
//            }
//            else if(i+1 < n && s.charAt(i) == 'I' && s.charAt(i+1) == 'X') {
//                sum += 9;
//                i++;
//            }
//            else if(i+1 < n && s.charAt(i) == 'I' && s.charAt(i+1) == 'V') {
//                sum += 4;
//                i++;
//            }
//            else if(s.charAt(i) == 'M'){
//                sum += 1000;
//            }
//            else if(s.charAt(i) == 'D'){
//                sum += 500;
//            }
//            else if(s.charAt(i) == 'C'){
//                sum += 100;
//            }
//            else if(s.charAt(i) == 'L'){
//                sum += 50;
//            }
//            else if(s.charAt(i) == 'X'){
//                sum += 10;
//            }
//            else if(s.charAt(i) == 'V'){
//                sum += 5;
//            }
//            else if(s.charAt(i) == 'I'){
//                sum += 1;
//            }
//        }
//        System.out.println(sum);
//    }


        //METHOD 2
        int n = s.length();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = value(s.charAt(i));
            if (i + 1 < s.length()) {
                int next = value(s.charAt(i + 1));
                if (curr < next)
                    sum -= curr;
                else
                    sum += curr;
            } else {
                sum += curr;
            }
        }
        System.out.println(sum);
    }
    public static int value(char ch){
        if (ch == 'I') return 1;
        else if (ch == 'V') return 5;
        else if (ch == 'X') return 10;
        else if (ch == 'L') return 50;
        else if (ch == 'C') return 100;
        else if (ch == 'D') return 500;
        else if (ch == 'M') return 1000;
        return 0;
    }
}