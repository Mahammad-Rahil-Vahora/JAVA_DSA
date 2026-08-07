package MultiDimension_Array;

import java.util.Scanner;

public class Search2DMatrix {
    static void main(String[] args) {

        int [][] arr = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}};

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        boolean ans = searchMatrix(arr,target);
        System.out.println(ans);
    }
    public static boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length;
        int n = arr[0].length;

        int low = 0;
        int high = m*n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int row = mid / n;
            int col = mid % n;

            if(arr[row][col] == target)
            {
                System.out.println(row + " " + col);
                return true;
            }
            else if (arr[row][col] < target)  low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}
