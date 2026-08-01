package Strings;

import java.util.Arrays;

public class ValidAnagram {
   public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        //true

//       String s = "rat";
//       String t = "car";
//       false

       boolean ans = check(s,t);
       System.out.println(ans);
   }

    public static boolean check(String s, String t) {
        if(s.length() != t.length()) return false;

        char [] arr1 = s.toCharArray();
        Arrays.sort(arr1);

        char [] arr2 = t.toCharArray();
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}
