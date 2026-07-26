package Strings;

public class CountAndSay {
    static void main(String[] args) {
        int n = 4;
        //1211
//        int n = 1;
//        1

//n = 1 → "1"
//n = 2 → "11"
//n = 3 → "21"
//n = 4 → "1211"
//n = 5 → "111221"
//n = 6 → "312211"

        String ans = "1";

        for (int k = 2; k <= n; k++) {
            StringBuilder sb = new StringBuilder();

            int i = 0;

            while(i < ans.length()){

                char ch = ans.charAt(i);
                int count = 0;

                while (i < ans.length() && ans.charAt(i) == ch) {
                    count++;
                    i++;
                }

                sb.append(count);
                sb.append(ch);
            }
            ans = sb.toString();
        }
        System.out.println(ans);


    }
}
