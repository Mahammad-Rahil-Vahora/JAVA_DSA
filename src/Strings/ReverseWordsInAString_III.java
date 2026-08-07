package Strings;

public class   ReverseWordsInAString_III {
    static void main(String[] args) {
        String s = "hello java";
        // olleh avaj

//        // METHOD 2 My Approch
//        StringBuilder sb = new StringBuilder(s);
//
//        int n = sb.length();
//        int i = 0, j = 0, k = 0;
//        while (j < n) {
//
//            if (j == n - 1 || sb.charAt(j + 1) == ' ') {
//                k = j;
//                while (i < j) {
//                    char temp = sb.charAt(i);
//                    sb.setCharAt(i, sb.charAt(j));
//                    sb.setCharAt(j, temp);
//                    i++;
//                    j--;
//                }
//
//                i = k + 2;
//                j = k + 2;
//            } else {
//                j++;
//            }
//        }
//        System.out.println(sb);

        // METHOD 1 Optimal
        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (String word : words) {
            ans.append(new StringBuilder(word).reverse());
            ans.append(" ");
        }
        String result = ans.toString().trim();
        System.out.println(result);
    }
}
