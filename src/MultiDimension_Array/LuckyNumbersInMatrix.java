package MultiDimension_Array;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInMatrix {
    static void main(String[] args) {
        int [][] arr = {
                {3,7,8},
                {9,11,13},
                {15,16,17}}; // 15

//        int [][] arr = {
//                {3,6},
//                {7,1},
//                {5,2},
//                {4,8}}; // []

        List<Integer> ans = luckyNumbers(arr);
        System.out.println(ans);

    }

    public static List<Integer> luckyNumbers(int[][] arr) {
        List <Integer> ans = new ArrayList<>();

        int m = arr.length;
        int n  = arr[0].length;

        for(int i = 0; i < m; i++){
            int min = Integer.MAX_VALUE;
            int col = -1;
            for(int j = 0; j < n; j++){
                if(arr[i][j] < min) {
                    min = arr[i][j];
                    col = j;
                }
            }

            boolean lucky = true;

            for (int k = 0; k < m; k++) {
                if (arr[k][col] > min) {
                    lucky = false;
                    break;
                }
            }
            if (lucky == true) {
                ans.add(min);
            }
        }
        return ans;
    }
}
