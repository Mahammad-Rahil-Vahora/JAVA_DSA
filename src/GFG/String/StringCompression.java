package GFG;

public class StringCompression {
    static void main(String[] args) {
        String s = "aaabcccccdd";
        String result = compression(s);
        System.out.println(result);
    }
    public static String compression (String s) {
        int n = s.length();
        String ans  = "";
        int count = 1;

        for (int i = 0; i < n; i++) {
            if(i+1 < n && s.charAt(i) == s.charAt(i+1)) count++;
            else {
                ans += s.charAt(i);
                ans += count;
                count = 1;
            }
        }
        return ans;
    }
}
