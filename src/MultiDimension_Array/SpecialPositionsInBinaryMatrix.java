package MultiDimension_Array;

public class SpecialPositionsInBinaryMatrix {
    static void main(String[] args) {
        int [][] arr = {
                {1,0,0},
                {0,1,0},
                {0,0,1}}; // 3

//        int [][] arr = {
//                {1,0,0},
//                {0,0,1},
//                {1,0,0}}; // 1

        int ans = numSpecial(arr);
        System.out.println(ans);
    }

    public static int numSpecial (int [][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        int [] row = new int [m];
        int [] column = new int [n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] == 1) {
                    row[i]++;
                    column[j]++;
                }
            }
        }

        int ans = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] == 1 && row[i] == 1 && column[j] == 1) ans++;
            }
        }
        return ans;
    }
}
