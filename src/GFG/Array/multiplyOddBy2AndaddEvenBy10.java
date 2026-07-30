import java.util.Scanner;

public class multiplyOddBy2AndaddEvenBy10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [6];
        System.out.println("Enter the elements of Array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
//        int [] arr = {1,2,3,4,5,6};
        int n = arr.length;
        System.out.println("Length is: " + n);
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                System.out.print(arr[i] + 10 + " ");
            }
            else{
                System.out.print(2 * arr[i] + " ");
            }
        }
    }
}
