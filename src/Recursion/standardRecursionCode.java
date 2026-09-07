package Recursion;

public class standardRecursionCode {
    public static void main(String[] args) {
        int n = 3;
        fun1(n);
        System.out.println();
        fun2(n);
        System.out.println();
        fun3(n);
    }

    // call before work
    public static void fun1(int n){
        if(n == 0) return;
        fun1(n-1);
        System.out.println(n);
    }

    // call after work
    public static void fun2(int n){
        if(n == 0) return;
        System.out.println(n);
        fun2(n-1);
    }

    // work before call and after work
    public static void fun3(int n){
        if(n == 0) return;
        System.out.println(n);
        fun3(n-1);
        System.out.println(n);
    }
}
