package Recursion;

import java.util.Scanner;

public class powerOfNumber {
    // Given a number n find the value of n raised to the power of it's own reverse.
    // ex :- 2 o/p :- 4
    // ex :- 10 o/p :- 10
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverseExponational(n));
    }
    public static int reverseExponational(int n){
        if(n == 10) return 10;
        return pow(n,n);
    }
    public static int pow(int a,int b){
        if(b == 0) return 1;
        int call = pow(a,b/2);
        if(b % 2 == 0) return call * call;
        return call * call * a;
    }
}
