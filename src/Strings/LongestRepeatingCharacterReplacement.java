package Strings;

public class LongestRepeatingCharacterReplacement {
    static void main(String[] args) {
     String s = "ABAB";
     int k = 2;
     //4



//     String s = "AABABBA";
//     int k = 1;
//     //4

        int i = 0;
        int maxlen = 0;
        int maxfrq = 0;

        int [] freq = new int [26];

        for (int j = 0; j < s.length(); j++) {
            int Jindex = s.charAt(j) - 'A';
            freq[Jindex]++;

            maxfrq = Math.max(maxfrq,freq[Jindex]);

            while ((j - i + 1) - maxfrq > k){
                int Iindex = s.charAt(j) - 'A';
                freq[Iindex]--;
                i++;
            }

            maxlen = Math.max(maxlen,j - i + 1);
        }
        System.out.println(maxlen);

    }

}
