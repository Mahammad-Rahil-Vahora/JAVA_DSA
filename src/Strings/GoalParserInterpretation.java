package Strings;

public class GoalParserInterpretation {
    static void main(String[] args) {
        String s = "G()(al)";
        StringBuilder ans = new StringBuilder();
        //Goal
        // (al)G(al)()()G --> alGalooG

        int n  = s.length();
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) == 'G') ans.append('G');
            else if(s.charAt(i) == '(' && s.charAt(i+1) == ')') {
                ans.append('o');
                i++;
            }
            else if(s.charAt(i) == '(' && s.charAt(i+1) == 'a' && s.charAt(i+2) == 'l' && s.charAt(i+3) == ')') {
                ans.append("al");
                i+=3;
            }
        }
       String reslut = ans.toString();
        System.out.println(reslut);
    }
}
