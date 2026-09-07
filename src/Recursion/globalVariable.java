package Recursion;

public class globalVariable {
    static int x = 10;
    static int y = 20;
    static void main(String[] args) {
        int z = 30;
        change();
        System.out.println(x + " " +y); // 20 10
    }
    static void change(){
        x = 20; // value are change bcz it is a global variable
        y = 10; // value are change bcz it is a global variable
//        z = 40; // not used z bcz it is a local variable and only accessable within the that brackets.
    }
}
