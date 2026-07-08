import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6,7};
        System.out.println("enter the number to want rotate: ");
        int d = sc.nextInt();
        int n = arr.length;
        d %=n;

        System.out.println("First half rotate:");
        rotate(arr,0,d-1);
        System.out.println("Second half rotate:");
        rotate(arr,d,n-1);
        System.out.println("Full array rotate:");
        rotate(arr,0,n-1);

        System.out.println();
        System.out.println("Final rotate Array is: ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }

    private static void rotate(int[] arr, int i, int j) {
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println(" ");
    }


}
