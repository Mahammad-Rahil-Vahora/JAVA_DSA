package MultiDimension_Array;

public class DetermineWhetherMatrixCanBeObtainedByRotation {
    static void main(String[] args) {
//        int [][] arr = {
//                {0,1},
//                {1,0}};
//
//        int [][] target = {
//                {1,0},
//                {0,1}};
//        // true

//        int [][] arr = {
//                {0,1},
//                {1,1}};
//
//        int [][] target = {
//                {1,0},
//                {0,1}};
//        // false
//
        int [][] arr = {
                {0,0,0},
                {0,1,0},
                {1,1,1}};

        int [][] target = {
                {1,1,1},
                {0,1,0},
                {0,0,0}};
        // true

        boolean ans = findRotation(arr,target);
        System.out.println(ans);
    }

    public static boolean findRotation (int [][] arr, int [][] target) {
        for (int i = 0; i < 4; i++) {
            if(isequal(arr,target)) return true;
            else arr = rotate(arr);
        }
        return false;
    }

    public static boolean isequal (int [][] arr, int [][] target) {
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] != target[i][j]) return false;
            }
        }
        return true;
    }

    public static int[][] rotate (int [][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int [][] newArr = new int [m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                newArr[j][n-1-i] = arr[i][j];
            }
        }
        return newArr;
    }
}
