import java.util.Scanner;

public class AlphabetTriangleHorizonataalyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print((char)(j+64) + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

//        int a = n;
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= a; j++) {
//                System.out.print((char)(j+64) + " ");
//            }
//            a--;
//            System.out.println(" ");
//        }


//        A A A A
//        B B B
//        C C
//        D


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print((char)(i+64) + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= a; j++) {
//                System.out.print((char)(i+64) + " ");
//            }
//            a--;
//            System.out.println(" ");
//        }
    }
}


public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("enter the number");
    int n = sc.nextInt();
    if(n % 2 == 1){
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n;j++)
            {
                if(i == n/2+1 || j == n/2+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println(" ");
        }
    }
    else
        System.out.println("Please! enter the odd number");

}