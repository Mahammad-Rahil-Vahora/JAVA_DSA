package Array.Level_4;

import java.util.ArrayList;
import java.util.Arrays;

public class threeSum {
    static void main(String[] args) {
        int [] arr = {-1,2,0,1,-1,-4};
        Arrays.sort(arr);

        ArrayList <ArrayList <Integer>> result = ThreeSum (arr);
        System.out.println(result);
    }

    public static ArrayList<ArrayList<Integer>> ThreeSum (int [] arr) {
        int n = arr.length;

        ArrayList <ArrayList <Integer>> ans = new ArrayList <> ();

        for (int i = 0; i < n-2; i++) {
            if(i > 0 && arr[i] == arr[i-1]) continue;

            int k = i + 1;
            int j = n-1;

            while(k < j){
                int sum = arr[i] + arr[k] + arr[j];

                if(sum == 0) {
                    ans.add(new ArrayList<>(Arrays.asList(arr[i], arr[k], arr[j])));
                    k++;
                    j--;

                    while(k < j && arr[k] == arr[k-1]) k++;
                    while(k < j && arr[j] == arr[j+1]) j++;
                }
                else if(sum > 0) {
                    j--;
                }
                else {
                    k++;
                }
            }
        }
        return ans;
    }
}
