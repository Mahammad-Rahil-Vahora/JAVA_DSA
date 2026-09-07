package Recursion;

import java.util.Scanner;

public class increasingAndDecresingNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
    public static void print(int n){
        // METHOD 1
        if(n == 0) return;
        System.out.print(n + " ");
        print(n-1);
        if(n != 1) System.out.print(n + " ");

//        // METHOD 2
//        if(n == 1) {
//            System.out.print(n + " ");
//            return;
//        }
//        System.out.print(n + " ");
//        print(n-1);
//        System.out.print(n + " ");
    }
}
