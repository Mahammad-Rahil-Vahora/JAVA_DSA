package GFG.MultiDimensionArray;

public class FindMinimumElementOutOfAllMaximumElementsOfEachRow {
    static void main(String[] args) {
        int [][] matrix = {{6,9,20,5},{1,4,19,8},{2,4,5,9}};
        int m = matrix.length;
        int n = matrix[0].length;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] > max) max = matrix[i][j];
            }
            if(min > max) min = max;
        }
        System.out.println(min);
    }
}
