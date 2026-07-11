import java.util.Scanner;

public class Dimond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

//        METHOD 1

        int sp = n-1;
        int st = 1;

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= sp; j++){
                System.out.print("  ");
            }

            for(int j = 1 ; j <= st; j++){
                System.out.print("* ");
            }

            sp -=1;
            st +=2;
            System.out.println();
        }


        int nsp = 1;
        int nst = 2*n - 3;

        for(int i = n+1 ; i <= 2*n - 1 ; i++){
            for(int j = 1 ; j <= nsp; j++){
                System.out.print("  ");
            }

            for(int j = 1; j <= nst; j++){
                System.out.print("* ");
            }

            nsp +=1;
            nst -=2;
            System.out.println();
        }


//      METHOD 2
        int SP = n-1;
        int ST = 1;

        int NSP = 1;
        int NST = 2*n - 3;

        for(int i = 1 ; i <= 2*n-1 ; i++){
            if( i <= n){
                for(int j = 1; j <= SP; j++){
                    System.out.print("  ");
                }

                for(int j = 1; j <= ST; j++){
                    System.out.print("* ");
                }
                SP -=1;
                ST +=2;
                System.out.println();
            }
            else{
                for(int j = 1; j <= NSP; j++){
                    System.out.print("  ");
                }

                for(int j = 1; j <= NST; j++){
                    System.out.print("* ");
                }
                NSP +=1;
                NST -=2;
                System.out.println();
            }

        }

    }
}
