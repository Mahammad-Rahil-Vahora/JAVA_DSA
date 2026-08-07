package Strings;

public class StringCompression {
    static void main(String[] args) {
//        char [] characters = {'a','a','b','b','c','c','c'};
        //6
//         char [] characters = {'a'}; // 1
         char [] characters = {'a','b','b','b','b','b','b','b','b','b','b','b','b'}; // 4

        // T.C = O(n^2), S.C = O(1),in-pace Solution
        int i = 0;
        int index = 0;

        while(i < characters.length) {
            char ch = characters[i];
            int count = 0;

            while (i < characters.length && characters[i] == ch) {
                count++;
                i++;
            }
            characters[index] = ch;
            index++;

            if(count > 1) {
                String s = count + "";
                for (int j = 0; j < s.length(); j++) {
                    characters[index] = s.charAt(j);
                    index++;
                }
            }
        }
        System.out.println(index);

//        // T.C = O(n^2), S.C = O(n), No in-pace Solution
//        StringBuilder ans = new StringBuilder();
//        int count = 1;
//
//        for (int i = 0; i < characters.length; i++) {
//
//            if (i + 1 < characters.length && characters[i] == characters[i + 1]) {
//                count++;
//            } else {
//                ans.append(characters[i]);
//
//                if (count > 1) {
//                    ans.append(count);
//                }
//
//                count = 1;
//            }
//        }
//        System.out.println(ans.length());
    }
}
