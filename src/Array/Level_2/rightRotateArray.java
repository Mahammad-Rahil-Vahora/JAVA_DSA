package Array.Level_2;

import java.util.Scanner;

public class rightRotateArray {
    public static void main(String[] args) {
        int [] arr ={1,30,2,0,3,24,5,4,9};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element rotate" );
        int k = sc.nextInt();
//        int k = k % n;
        int d = n - (k % n);


        System.out.println("Real array:");
        print(arr);
        rotate(arr,0,d-1);
        rotate(arr,d,n-1);
        rotate(arr,0,n-1);
        System.out.println("right rotate:");
        print(arr);
    }

    public static void rotate(int [] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

    public static void print(int [] arr){
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println(" ");
    }
}
