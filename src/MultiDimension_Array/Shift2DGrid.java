package MultiDimension_Array;

import java.util.ArrayList;
import java.util.List;

public class Shift2DGrid {
    static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int k = 1;

//        Output: [[9,1,2],[3,4,5],[6,7,8]]

//        int [][] arr = {
//                {3,8,1,9},
//                {19,7,2,5},
//                {4,6,11,10},
//                {12,0,21,13}};
//        int k = 4;

//        Output: [[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]

        List<List<Integer>> ans = shiftGrid(arr, k);

        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    // METHOD 1
    // This is required method for interview
    public static List<List<Integer>> shiftGrid(int[][] arr, int k) {
        int m = arr.length;
        int n = arr[0].length;
        int total = m * n;
        k = k % total;

        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int index = i * n + j;  // 2D to 1D
                int newIndex = (index + k) % total; // shift by k

                int newRow = newIndex / n; // 1D to 2D row count
                int newCol = newIndex % n; // 1D to 2D column count

                ans[newRow][newCol] = arr[i][j];
            }
        }

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(ans[i][j]);
            }
            result.add(row);
        }
        return result;
    }



//    // METHOD 2
//    // This is my thinking
//    public static List<List<Integer>> shiftGrid(int[][] mat, int k) {
//
//        int m = mat.length;
//        int n = mat[0].length;
//
//        int[] arr = new int[m * n];
//        int l = 0;
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[l++] = mat[i][j];
//            }
//        }
//
//        k = k % l;
//
//        revrse(arr, 0, l - 1);
//        revrse(arr, 0, k - 1);
//        revrse(arr, k, l - 1);
//
//        List<List<Integer>> ans = new ArrayList<>();
//        int idx = 0;
//
//        for (int i = 0; i < m; i++) {
//            List<Integer> row = new ArrayList<>();
//            for (int j = 0; j < n; j++) {
//                row.add(arr[idx++]);
//            }
//            ans.add(row);
//        }
//        return ans;
//    }
//
//    public static void revrse(int[] arr, int i, int j) {
//        while (i < j) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
//    }
}
