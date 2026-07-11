import java.util.Scanner;

public class Arrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();

        int sp = n-1;
        int st = 1;

        for(int i = 1; i <=n; i++){

                for(int j = 1; j <= sp; j++){
                    System.out.print("  ");
                }
                for(int j = 1; j <=st; j++){
                    System.out.print("* ");

                }
            sp -= 1;
            st += 2;
            System.out.println();
            }

        int sps = 1;
        int sts = 2*n - 3;

        for(int i = n; i <= 2*n-1; i++){

                for(int j = 1; j <= sps; j++){
                    System.out.print("  ");
                }
                for(int j = 1; j <=sts; j++) {
                    System.out.print("* ");
                }
            sp += 1;
            st -= 2;
            System.out.println();
            }


        }

    }
