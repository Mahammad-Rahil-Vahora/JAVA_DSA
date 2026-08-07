package MultiDimension_Array;

public class SetMatrixZeroes {
    static void main(String[] args) {
//        int [][] arr = {
//                {1,1,1},
//                {1,0,1},
//                {1,1,1}};

//        Output: [[1,0,1],[0,0,0],[1,0,1]]

        int [][] arr = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}};

//        Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

        int [][] ans = setZeroes(arr);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] setZeroes (int [][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        boolean [] row = new boolean[m];
        boolean [] column = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(row[i] == true || column[j] == true) arr[i][j] = 0;
            }
        }
        return arr;
    }
}
