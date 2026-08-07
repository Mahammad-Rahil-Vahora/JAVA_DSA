package MultiDimension_Array;

public class ReshapetheMatrix {
    static void main(String[] args) {
        int [][] arr = {{1,2},{3,4}};
        int r = 1, c = 4;

        int [][] ans = reshape(arr,r,c);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] reshape (int [][] arr, int r, int c) {
        int m = arr.length;
        int n = arr[0].length;

        if(m * n != r * c) return arr;

        int [][] ans = new int [r][c];

        int x = 0, y = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[x][y] = arr[i][j];
                y++;

                if(y == c) {
                    x++;
                    y = 0;
                }
            }
        }
        return ans;
    }
}
