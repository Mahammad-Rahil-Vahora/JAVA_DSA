package MultiDimension_Array;

public class MatrixDiagonalSum {
    static void main(String[] args) {
//        int [][] arr = {
//        {1,2,3},
//        {4,5,6},
//        {7,8,9}}; // 30
        int [][] arr = {
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},}; // 8

        int ans = diagonalSum(arr);
        System.out.println(ans);
    }

    public static int diagonalSum(int[][] arr) {

        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i][i];
            sum += arr[i][n - 1 -i];
        }
        if(n % 2 == 1) sum -= arr[n/2][n/2];
        return sum;
    }
}
