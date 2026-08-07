package Strings;

public class TruncateSentence {
    static void main(String[] args) {
        String s = "Hello how are you contestant";
        int k = 4;

        String ans = truncateSentence(s,k);
        System.out.println(ans);
    }

    public static String truncateSentence (String s, int k) {

       //METHOD 1
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
                if (count == k) {
                    return s.substring(0, i);
                }
            }
        }
        return s;

        //METHOD 2
//        String [] arr = s.split(" ");
//        String ans = "";
//
//        for (int i = 0; i < k; i++) {
//            ans += arr[i];
//            ans += " ";
//        }
//        ans = ans.trim();
//        return ans;
    }
}
