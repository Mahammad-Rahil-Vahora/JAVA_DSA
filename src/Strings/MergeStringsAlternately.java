package Strings;

public class MergeStringsAlternately {
    static void main(String[] args) {
        String s1 = "abcdefgh";
        String s2 = "pqrst";
        //apbqcrdsetfgh
        String ans = "";

        int i = 0;
        int j = 0;


        while(i < s1.length() || j < s2.length()){
            if(i < s1.length()) ans += s1.charAt(i);
            i++;
            if(j < s2.length()) ans += s2.charAt(j);
            j++;
        }
        System.out.println(ans);
    }
}
