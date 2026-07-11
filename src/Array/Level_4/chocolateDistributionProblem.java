package Array.Level_4;

import java.util.Arrays;

public class chocolateDistributionProblem {
    static void main(String[] args) {
//        int [] arr = {3,4,1,9,56,7,9,12};
//        int m = 5;

        int [] arr = {7,3,2,4,9,12,56};
        int m = 3;
        int n= arr.length;

        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n-m; i++) {
            int dif = arr[i+m-1] - arr[i];
            if(dif < min){
                min = dif;
            }

        }
        System.out.println(min);
    }
}
