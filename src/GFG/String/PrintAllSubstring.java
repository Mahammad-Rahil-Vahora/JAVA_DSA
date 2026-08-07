package GFG.String;

public class PrintAllSubstring {
    static void main(String[] args) {
        String s = "abc";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String t = s.substring(i,j+1);
                System.out.println(t + " ");
            }
            System.out.println();
        }
    }
}
