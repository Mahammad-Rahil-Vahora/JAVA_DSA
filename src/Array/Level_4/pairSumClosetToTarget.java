package Array.Level_4;

import java.util.ArrayList;
import java.util.Arrays;

public class pairSumClosetToTarget {
    static void main(String[] args) {
        int [] arr = {5,2,7,1,4};
        int target = 10;
        ArrayList<Integer>  ans = pairSum(arr,target);
        System.out.println(ans);
    }

    public static ArrayList <Integer> pairSum (int [] arr, int target){
        Arrays.sort(arr);
        int n = arr.length;
        int i = 0;
        int j = n-1;
        ArrayList <Integer> ans = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        int pairdiff = -1;

        while(i < j){
            int sum = arr[i] + arr[j];
            int diff = Math.abs(sum - target);
            int currentPairDiff = Math.abs(arr[i] - arr[j]);

            if(minDiff > diff) {
                minDiff = diff;
                pairdiff = currentPairDiff;
                ans.clear();
                ans.add(arr[i]);
                ans.add(arr[j]);
            }
//
            else if(minDiff == diff && currentPairDiff > pairdiff){
                pairdiff = currentPairDiff;
                ans.clear();
                ans.add(arr[i]);
                ans.add(arr[j]);

            }

            if(sum == target){
                break;
            }
            else if(sum < target){
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
    }
}
