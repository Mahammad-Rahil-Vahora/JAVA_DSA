package GFG.MultiDimensionArray;

public class RowWithMaximumSum {
    static void main(String[] args) {
        int [][] matrix = {{6,9,20,5},{1,4,19,8},{2,4,5,90}};
        int m = matrix.length;
        int n = matrix[0].length;
        int maxsum = Integer.MIN_VALUE;
        int row = -1;

        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j];
            }
            if(sum > maxsum){
                maxsum = sum;
                row = i;
            }
        }
        System.out.println("Row is: " + row + " " + "Maxsum is: " + maxsum);
    }
}
