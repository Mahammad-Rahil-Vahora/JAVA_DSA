package MultiDimension_Array;

public class CountNegativeNumbersInSortedMatrix {
    static void main(String[] args) {
        int [][] arr = {
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}}; // 8

//        int [][] arr = {{3,2},{1,0}}; // 0

        int ans = countNegatives(arr);
        System.out.println(ans);
    }

    public static int countNegatives(int[][] arr) {
        int m = arr.length;
        int n  = arr[0].length;

        int i = 0, j = n-1, count = 0;

        while(i < m && j >= 0) {
            if(arr[i][j] < 0) {
                count += m - i;
                j--;
            }
            else i++;
        }
        return count;
    }
}
