package GFG.String;

public class ChangeString {
    static void main(String[] args) {
        String s = "aBCd";
        // abcd
        String t = "ABcd";
        //ABCD

        String ans1 = change(s);
        System.out.println(ans1);
        String ans2 = change(t);
        System.out.println(ans2);
    }

    public static String change(String s){
        if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z') s = s.toLowerCase();
        else s = s.toUpperCase();
        return s;
    }
}
