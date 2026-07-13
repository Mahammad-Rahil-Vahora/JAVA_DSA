package Array.Level_4;

import java.util.ArrayList;
import java.util.Arrays;

public class intersectionOfTwoArray {
    static void main(String[] args) {
        int [] arr = {4,9,5};
        int [] brr = {9,4,4,9,8};

        ArrayList <Integer> result = Intersection(arr,brr);
        System.out.println(result);
    }

    public static ArrayList <Integer> Intersection(int [] arr, int [] brr){
        Arrays.sort(arr);
        Arrays.sort(brr);

        int n = arr.length;
        int m = brr.length;

        ArrayList <Integer> ans = new ArrayList <> ();

        int i = 0;
        int j = 0;

        while(i < n && j < m) {
            if(arr[i] == brr[j]) {
                ans.add(arr[i]);
                i++;
                j++;
            }
            else if(arr[i] > brr[j]){
                j++;
            }
            else {
                i++;
            }
        }
        return ans;
    }
}
