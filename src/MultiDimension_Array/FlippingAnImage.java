package MultiDimension_Array;

public class FlippingAnImage {
    static void main(String[] args) {
//        int [][] arr = {
//                {1,1,0},
//                {1,0,1},
//                {0,0,0}};

//        Output: [[1,0,0],[0,1,0],[1,1,1]]

        int [][] arr = {
                {1,1,0,0},
                {1,0,0,1},
                {0,1,1,1},
                {1,0,1,0}};

//        OP = [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]

        int [][] ans = filp(arr);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] filp(int [][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            int st = 0, end = n - 1;
            while (st <= end) {
                int temp = arr[i][st];
                arr[i][st] = arr[i][end];
                arr[i][end] = temp;
                st++;
                end--;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] == 1) arr[i][j] = 0 ;
                else arr[i][j] = 1 ;
            }
            System.out.println();
        }
        return arr;
    }
}
