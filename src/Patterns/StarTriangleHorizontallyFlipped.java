import java.util.Scanner;

public class StarTriangleHorizontallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enetr the number: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

//         int a = n;
//
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= a; j++){
//                System.out.print("* ");
//            }
//            a--;
//            System.out.println(" ");
//        }
    }
}
