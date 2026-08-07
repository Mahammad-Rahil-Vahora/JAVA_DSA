package MultiDimension_Array;

import java.util.ArrayList;

public class SpiralMatrix {
    static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30}};

        ArrayList<Integer> ans = spiral(arr);
        System.out.println(ans);
    }

    public static ArrayList <Integer> spiral (int [][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        ArrayList <Integer> ans = new ArrayList <> ();

        int fr = 0, lr = m - 1;
        int fc = 0, lc = n - 1;

//        // METHOD 1
//        while (fr <= lr && fc <= lc){
//            // first row (left to right)
//            for (int j = fc; j <= lc; j++) {
//                ans.add(arr[fr][j]);
//            }
//            fr++; // go to next row
//            if(fr > lr || fc > lc) break;
//
//            // last column (up to down)
//            for (int i = fr; i <= lr; i++) {
//                ans.add(arr[i][lc]);
//            }
//            lc--; // go to previous column
//            if(fr > lr || fc > lc) break;
//
//            // last row (right to left)
//            for (int j = lc; j >= fc; j--) {
//                ans.add(arr[lr][j]);
//            }
//            lr--; // go to above row
//            if(fr > lr || fc > lc) break;
//
//            // first column (down to up)
//            for (int i = lr; i >= fr; i--) {
//                ans.add(arr[i][fc]);
//            }
//            fc++; // go to next column
//        }
//        return ans;

        // METHOD 2

        int totalEle = m*n;
        while (ans.size() < totalEle){
            // first row (left to right)
            for (int j = fc; j <= lc; j++) {
                ans.add(arr[fr][j]);
            }
            fr++; // go to next row
            if(ans.size() >= totalEle) break;

            // last column (up to down)
            for (int i = fr; i <= lr; i++) {
                ans.add(arr[i][lc]);
            }
            lc--; // go to previous column
            if(ans.size() >= totalEle) break;

            // last row (right to left)
            for (int j = lc; j >= fc; j--) {
                ans.add(arr[lr][j]);
            }
            lr--; // go to above row
            if(ans.size() >= totalEle) break;

            // first column (down to up)
            for (int i = lr; i >= fr; i--) {
                ans.add(arr[i][fc]);
            }
            fc++; // go to next column
        }
        return ans;
    }
}
