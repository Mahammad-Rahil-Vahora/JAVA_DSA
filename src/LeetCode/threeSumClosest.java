package LeetCode;

import java.util.Arrays;

public class threeSumClosest {
    public static void main(String[] args) {
        int [] arr = {-1,2,1,4};
        int target = 1;
        int ans= threeSumClosest(arr,target);
        System.out.println(ans);

    }

public static int threeSumClosest(int [] arr, int target) {


        int n = arr.length;

        Arrays.sort(arr);


        int diff = Integer.MAX_VALUE;
        int close = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int k = i + 1;
            int j = n-1;

            while(k < j) {
                sum = arr[i] + arr[j] + arr[k];

                if(Math.abs(sum - target) < diff) {
                    diff = Math.abs(sum - target);
                    close = sum;
                }
                if(sum == target) {
                    close = sum;
                    k++;
                    j--;
                }
                else if (sum < target) {
                    k++;
                }
                else {
                    j--;
                }
            }
        }
        return close;
    }
}
