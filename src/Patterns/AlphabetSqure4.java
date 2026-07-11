import java.util.Scanner;

public class AlphabetSqure4 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i % 2 == 1)
                    System.out.print((char)('a'+i-1)+" ");
                else
                    System.out.print((char)('A'+i-1)+" ");
            }
            System.out.println(" ");
        }
    }
}
