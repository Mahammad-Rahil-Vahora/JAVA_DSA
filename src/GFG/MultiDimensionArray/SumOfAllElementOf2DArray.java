package GFG.MultiDimensionArray;

public class SumOfAllElementOf2DArray {
    static void main(String[] args) {
        int [][] matrix = {{6,9,20,5},{1,4,19,8},{2,4,5,90}};
        int m = matrix.length;
        int n = matrix[0].length;
        int sum = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}
