package Strings;

import java.util.Scanner;

public class DefangingAnIPAddress {
    static void main(String[] args) {
//        String s = "rahal";
//        s = s.replace("a","o");
//        System.out.println(s);

//        String s = "1.1.1.1";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the IP Address");
        String str = sc.nextLine();
        String ans = change(str);
        System.out.println(ans);
    }
    public static String change (String s) {
        s = s.replace(".","[.]");
        return s;
    }
}
