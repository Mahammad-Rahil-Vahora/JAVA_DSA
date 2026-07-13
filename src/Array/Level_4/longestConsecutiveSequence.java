package Array.Level_4;

import java.util.Arrays;

public class longestConsecutiveSequence {
    static void main(String[] args) {
        int [] arr = {100,4,200,5,4,3,5,7,8,6,1,2,3};
        int n = arr.length;

        Arrays.sort(arr);

        int count = 1;
        int maxcount = 1;

        for (int i = 0; i < n-1; i++) {
            if(arr[i] == arr[i+1]) {
                continue;
            }
            if(arr[i] + 1 == arr[i+1]) {
                count++;
            }

            maxcount = Math.max(count,maxcount);

        }
        System.out.println(maxcount);
    }
}
