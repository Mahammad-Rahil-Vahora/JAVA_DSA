package GFG.String;

public class ReverseEachWordInString {
    static void main(String[] args) {
        String s = "Hello Java";
        String ans = reverse(s);
        System.out.println(ans);
    }

    public static String reverse(String s){
        String [] word = s.trim().split("\\+s");
        String ans = "";
        for (int i = 0; i < word.length; i++) {
            for(int j = word[i].length()-1; j >=0; j--){
                ans += word[i].charAt(j);
            }
            if(i != word.length -1) ans += " ";
        }
        return ans;
    }
}
