package Strings;

public class CountAsterisks {
    public static void main(String[] args) {
        String s = "yo|uar|e**|b|e***au|tifu|l";
        // 5
        // METHOD 1 O(n2)
//        String [] word = s.split("\\|");
//        int n = word.length;
//        int count = 0;
//
//        for (int i = 0; i < n; i+=2) {
//            String ch = word[i];
//            for (int j = 0; j < ch.length(); j++) {
//                if(ch.charAt(j) == '*'){
//                    count += 1;
//                }
//            }
//
//        }
//        System.out.println(count);


        // METHOD 2 O(n)
        int count = 0;
        int pipe = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                pipe++;
            } else if (s.charAt(i) == '*' && pipe % 2 == 0) {
                count+=1;
            }
        }
        System.out.println(count);

    }
}
