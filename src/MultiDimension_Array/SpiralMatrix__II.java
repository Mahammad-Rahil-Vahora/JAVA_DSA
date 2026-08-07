package MultiDimension_Array;

public class SpiralMatrix__II {
    static void main(String[] args) {
        int n = 3;
        // Output: [[1,2,3],[8,9,4],[7,6,5]]

        int [][] ans = generateMatrix(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

//    // METHOD 1
//    public static int[][] generateMatrix(int n) {
//        int [][] arr = new int [n][n];
//        int totalEle = n*n;
//        int ele = 1;
//        int fr = 0, lr = n - 1;
//        int fc = 0, lc = n - 1;
//
//        while (ele <= totalEle){
//            // first row (left to right)
//            for (int j = fc; j <= lc; j++) {
//                arr[fr][j] = ele;
//                ele++;
//            }
//            fr++; // go to next row
//            if(ele > totalEle) break;
//
//            // last column (up to down)
//            for (int i = fr; i <= lr; i++) {
//                arr[i][lc] = ele;
//                ele++;
//            }
//            lc--; // go to previous column
//            if(ele > totalEle) break;
//
//            // last row (right to left)
//            for (int j = lc; j >= fc; j--) {
//                arr[lr][j] = ele;
//                ele++;
//            }
//            lr--; // go to above row
//            if(ele > totalEle) break;
//
//            // first column (down to up)
//            for (int i = lr; i >= fr; i--) {
//                arr[i][fc] = ele;
//                ele++;
//            }
//            fc++; // go to next column
//        }
//        return arr;
//    }

    // METHOD 2
    public static int[][] generateMatrix(int n) {
        int [][] arr = new int [n][n];
        int totalEle = n*n;
        int ele = 1;
        int fr = 0, lr = n - 1;
        int fc = 0, lc = n - 1;

        while (fr <= lr && fc <= lc){
            // first row (left to right)
            for (int j = fc; j <= lc; j++) {
                arr[fr][j] = ele;
                ele++;
            }
            fr++; // go to next row
            if(fr > lr || fc > lc) break;

            // last column (up to down)
            for (int i = fr; i <= lr; i++) {
                arr[i][lc] = ele;
                ele++;
            }
            lc--; // go to previous column
            if(fr > lr || fc > lc) break;

            // last row (right to left)
            for (int j = lc; j >= fc; j--) {
                arr[lr][j] = ele;
                ele++;
            }
            lr--; // go to above row
            if(fr > lr || fc > lc) break;

            // first column (down to up)
            for (int i = lr; i >= fr; i--) {
                arr[i][fc] = ele;
                ele++;
            }
            fc++; // go to next column
        }
        return arr;
    }
}


