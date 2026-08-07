package GFG.MultiDimensionArray;

public class TransposeOfMatrix {
    static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 0, 1, 2}, {3, 4, 5, 6}};
        int m = matrix.length;
        int n = matrix[0].length;


        // Before transpose
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //Actual transpose matrix in place
        for (int i = 0; i < m; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[j][i];
               matrix[j][i] = matrix[i][j];
               matrix[i][j] = temp;
            }
        }

        // transpose matrix in New Array
        int [][] transooseArray = new int [n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transooseArray[i][j] = matrix[j][i];
            }
        }

        // After Transpose
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i1 = 0; i1 < m; i1++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transooseArray[i1][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

