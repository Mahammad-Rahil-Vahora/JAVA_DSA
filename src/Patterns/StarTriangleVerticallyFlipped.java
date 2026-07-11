import java.util.Scanner;

public class StarTriangleVerticallyFlipped {
   public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter the number: ");
       int n = sc.nextInt();

//       METHOD 1


       for(int i = 1; i <= n; i++){
           for(int j = 1 ; j <= n; j++){
               if(i + j > n)
                   System.out.print("* ");
               else
                   System.out.print("  ");
           }
           System.out.println();
       }
       System.out.println();
//      METHOD 2

       for(int i = 1; i <= n; i++){
           for(int j = 1 ; j <= n-i; j++){
               System.out.print("  ");
           }
           for(int j = 1; j <= i; j++){
               System.out.print("* ");
           }
           System.out.println();
       }
    }

}
