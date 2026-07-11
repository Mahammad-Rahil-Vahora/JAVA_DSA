import java.util.Scanner;

public class NumberSpeiral_ZOOM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        for(int i = 1; i <= 2*n-1; i++){
            for(int j = 1; j <= 2*n-1; j++){
                int a = i; // jo ek ni ek (same) value biji var use karvi hoy to nwe temprory variable ma store karvi value and temprory varible ne j use karvo.
                int b = j;
                if(i > n) a = 2*n - i;
                if(j > n) b = 2*n - j;
                System.out.print(Math.min(a,b) + " ");
            }
            System.out.println();

        }
    }
}
