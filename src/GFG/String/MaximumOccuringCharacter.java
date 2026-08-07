package GFG.String;

public class MaximumOccuringCharacter {
    static void main(String[] args) {
        String s = "rahilandfarhanarebhai";
        char ans = max(s);
        System.out.println(ans);
    }

    public static char max(String s) {

        int [] freq = new int [26];

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            freq[index]++;
        }

        int maxcount = Integer.MIN_VALUE;
        char ans = s.charAt(0);

        for (int i = 0; i < freq.length; i++) {
            if(maxcount < freq[i]){
                maxcount = Math.max(freq[i],maxcount);
                ans = (char) (i +'a');
            }
        }
        return ans;
    }
}
