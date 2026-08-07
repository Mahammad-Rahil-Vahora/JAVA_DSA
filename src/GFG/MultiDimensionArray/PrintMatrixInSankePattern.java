package GFG.MultiDimensionArray;

public class PrintMatrixInSankePattern {
    static void main(String[] args) {
        int [][] matrix = {{6,9,20,5},{1,4,19,8},{2,4,5,90},{2,4,5,90},{1,4,19,8},{6,9,20,5}};
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            if(i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            else {
                for (int j = n-1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

        }
    }
}
