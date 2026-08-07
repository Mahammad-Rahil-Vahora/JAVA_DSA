package Strings;

public class ReversePrefixOfWord {
    static void main(String[] args) {

        String s = "xyxyze";
        char ch = 'y';

        StringBuilder sb = new StringBuilder(s);
        int n = sb.length();

        int index = s.indexOf(ch);

        int i = 0;
        int j = index;

        while(i <= j) {
            char temp1 = sb.charAt(i);
            char temp2 = sb.charAt(j);
            sb.setCharAt(i,temp2);
            sb.setCharAt(j,temp1);
            i++;
            j--;
        }
        System.out.println(sb.toString());
    }
}
