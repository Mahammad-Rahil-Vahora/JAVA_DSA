package Recursion;

import java.util.Scanner;

public class waysToReachNthStairs {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(stairs(n));
    }
    public static int stairs (int n) {
        if(n <= 2) return n;
        return stairs(n-1) + stairs(n-2);
    }
}
