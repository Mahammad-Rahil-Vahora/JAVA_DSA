package Recursion;

import java.util.Scanner;

public class reverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(reverse(num,0));
    }
    public static int reverse(int n, int r){
        if(n == 0) return r;
        return reverse(n/10,r*10 + n%10);
    }
}
