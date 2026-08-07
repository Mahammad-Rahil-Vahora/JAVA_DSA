package GFG.MultiDimensionArray;

public class ReverseAllRowsOfGivenMatrixAndReverseColumn {
    static void main(String[] args) {
        int [][] matrix = {{6,9,20,5},{1,4,19,8},{2,4,50,9}};
        int m = matrix.length;
        int n = matrix[0].length;


        // only print 180 degree matrix
        for (int i = m-1; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //Actual rotate 180 degree matrix in place

        // Each Row is Reversed (Reversed column wise)
        for (int j = 0; j < n; j++) {
            int st = 0;
            int end = m-1;
            while(st <= end) {
                int temp = matrix[st][j];
                matrix[st][j] = matrix[end][j];
                matrix[end][j] = temp;
                st++;
                end--;
            }
        }

        // Each Column is Reversed (Reversed row wise)
        for (int i = 0; i < m; i++) {
            int st = 0;
            int end = n-1;
            while(st <= end) {
                int temp = matrix[i][st];
                matrix[i][st] = matrix[i][end];
                matrix[i][end] = temp;
                st++;
                end--;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
}
