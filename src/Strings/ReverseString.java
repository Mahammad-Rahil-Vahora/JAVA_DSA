package Strings;

public class ReverseString {
    static void main(String[] args) {
//        char [] s = {'h','e','l','l','o'};
        char [] s = {'h','e','l','l','e','h'};

        int n = s.length;
        int i = 0;
        int j = n-1;

        while(i <= j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        System.out.println(s);
    }
}
