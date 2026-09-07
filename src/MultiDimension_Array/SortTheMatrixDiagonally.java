package MultiDimension_Array;

public class SortTheMatrixDiagonally {
    static void main(String[] args) {
        int[][] arr = {
                {3,3,1,1},
                {2,2,1,2},
                {1,1,1,2}};

        int [][] ans = new int [arr.length][arr[0].length];

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
