package MultiDimension_Array;

import java.util.ArrayList;
import java.util.List;

public class ToeplitzMatrix {
    static void main(String[] args) {
        int [][] arr = {
                {1,2,3,4},
                {5,1,2,3},
                {9,5,1,2}};

        boolean ans = isToeplitzMatrix(arr);
        System.out.println(ans);
    }

    public static boolean isToeplitzMatrix(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if(arr[i][j] != arr[i+1][j+1]) return false;
            }
        }
        return true;
    }
}

