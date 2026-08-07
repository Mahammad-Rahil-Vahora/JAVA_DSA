package MultiDimension_Array;

public class RotateImage {
    static void main(String[] args) {
        int [][] matrix = {
                {2,8,3,4},
                {7,2,1,6},
                {5,5,4,1},
                {3,1,8,2}};

        int m =matrix.length;
        int n = matrix[0].length;

        // Before 90 Degree Rotate Print
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Transpose Of Array
        for (int i = 0; i < m; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] =temp;
            }
        }

        // Reverse Each Row
        for (int i = 0; i < m; i++) {
            int st = 0;
            int end = n-1;

            while (st <= end){
                int temp = matrix[i][st];
                matrix[i][st] =  matrix[i][end];
                matrix[i][end] = temp;
                st++;
                end--;
            }
        }

        // After 90 Degree Rotate Print
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
