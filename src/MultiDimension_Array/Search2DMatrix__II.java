package MultiDimension_Array;

import java.util.Scanner;

public class Search2DMatrix__II {
    static void main(String[] args) {
        int[][] arr = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        boolean ans = search(arr,target);
        System.out.println(ans);
    }

    public static boolean search(int [][] arr, int target){
        int m = arr.length;
        int n = arr[0].length;

        int i = 0, j = n-1;
        while(i < m && j >= 0){
            if (arr[i][j] < target) i++;
            else if (arr[i][j] > target) j--;
            else {
                System.out.println(i + " " + j);
                return true;
            }
        }
        return false;

//        // METHOD 1 But T.C = O(m*n)
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if(arr[i][j] == target) return true;
//            }
//        }
//        return false;
    }
}

