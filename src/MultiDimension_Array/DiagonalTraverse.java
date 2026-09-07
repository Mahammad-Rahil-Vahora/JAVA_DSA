package MultiDimension_Array;

import java.util.Arrays;

public class DiagonalTraverse {

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] ans = diagonalTraverse(arr);
        System.out.println(Arrays.toString(ans));
    }
//
//    // METHOD 1 (O(m*n)^2)
//    public static int[] diagonalTraverse(int[][] arr) {
//        int m = arr.length;
//        int n = arr[0].length;
//        int d = 0;
//
//        int[] result = new int[m * n];
//        int index = 0;
//
//        while (d < m + n - 1) {
//
//            ArrayList<Integer> ans = new ArrayList<>();
//
//            for (int i = 0; i < m; i++) {
//                for (int j = 0; j < n; j++) {
//                    if (i + j == d) {
//                        ans.add(arr[i][j]);
//                    }
//                }
//            }
//
//            if (d % 2 == 0) {
//                Collections.reverse(ans);
//            }
//            for (int num : ans) {
//                result[index++] = num;
//            }
//            d++;
//        }
//        return result;
//    }
//

    // METHOD 2 (O(m*n))
    public static int[] diagonalTraverse(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int d = 0;

        int[] result = new int[m * n];
        int index= 0;
        int row = 0;
        int col = 0;

        for (int i = 0; i < m*n; i++) {
            if (index < m*n) {
                result[index++] = arr[row][col];
            }


            // moving up-right
            if ((row + col) % 2 == 0) {
                if (col == n - 1) row++;
                else if (row == 0) col++;
                else {
                    row--;
                    col++;
                }
            } else {
                if (col == 0) row++;
                else if (row == m - 1) col++;
                else {
                    row++;
                    col--;
                }
            }
        }
        return result;
    }
}