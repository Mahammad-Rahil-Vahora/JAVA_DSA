package GFG.String;

public class SumOfAllSubstring {
    static void main(String[] args) {
        String s ="421";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String num = s.substring(i,j+1);
                sum += Integer.parseInt(num);
            }
        }
        System.out.println(sum);
    }
}
