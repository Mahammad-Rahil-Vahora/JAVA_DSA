package Strings;

public class ShuffleString {
    static void main(String[] args) {
//        String s = "codeleet";
//        int [] arr = {4,5,6,7,0,2,1,3};
        //leetcode

        String s = "alirh";
        int [] arr = {1,4,3,0,2};

        int n = arr.length;
        char [] ans = new char[n];

        for (int i = 0; i < n; i++) {
            int index = arr[i];
            ans[index]= s.charAt(i);
        }
        System.out.println(ans);
    }
}
