package Strings;

public class  MaximumNumberOfWordsFoundInSentences {
    public static void main(String[] args) {
//          String [] str = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
//        Output: 6

        String [] str  = {"please wait", "continue to fight i u o ", "continue to win"};
//        Output: 3


        // This is Optimal Solution
        int max = 0;
        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            int count = 1;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ' ') {
                    count++;
                }
            }
            if (count > max) {
                max = count;
            }
        }

        System.out.println(max);




//         // This is My Solution
//        int maximum = 0;
//        int n = str.length;
//        for (int i = 0; i < n; i++) {
//            String s = str[i];
//            String [] word = s.split("\\ ");
//            int wordLength = word.length;
//            if(wordLength > maximum) {
//                maximum = wordLength;
//            }
//        }
//        System.out.println(maximum);
    }
}
