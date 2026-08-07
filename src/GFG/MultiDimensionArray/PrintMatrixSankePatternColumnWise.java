package GFG.MultiDimensionArray;

public class PrintMatrixSankePatternColumnWise {
        static void main(String[] args) {
            int [][] matrix = {{6,9,2,5},{1,4,9,8},{2,4,5,9},{3,5,9,0},{4,1,9,8},{6,3,0,2}};
            int m = matrix.length;
            int n = matrix[0].length;

            for (int j = 0; j < n; j++) {
                if(j % 2 == 0) {
                    for (int i = 0; i < m; i++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
                else {
                    for (int i = m-1; i >= 0; i--) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }

            }
        }
}
