package Array.Level_4;

import java.util.ArrayList;
import java.util.Arrays;

public class fourSum {
    static void main(String[] args) {
        int [] arr = {-1,0,1,0,-2,2};
        Arrays.sort(arr);

        ArrayList <ArrayList<Integer>> result = FourSum (arr);
        System.out.println(result);
    }

    public static ArrayList<ArrayList<Integer>> FourSum (int [] arr) {
        int n = arr.length;

        ArrayList <ArrayList <Integer>> ans = new ArrayList <> ();

        for (int i = 0; i < n-3; i++) {
            if(i > 0 && arr[i] == arr[i-1]) continue;
            for (int j = i+1; j < n-2;j++){
                if(j > 0 && arr[j] == arr[j-1]) continue;
                int k = j + 1;
                int q = n - 1;

                while(k < q){
                    int sum = arr[i] + arr[k] + arr[q] + arr[j];

                    if(sum == 0) {
                        ans.add(new ArrayList<>(Arrays.asList(arr[i], arr[k], arr[q],arr[j])));
                        k++;
                        q--;

                        while(k < q && arr[k] == arr[k-1]) k++;
                        while(k < q && arr[q] == arr[q +1]) q++;
                    }
                    else if(sum > 0) {
                        q--;
                    }
                    else {
                        k++;
                    }
                }
            }
        }
        return ans;
    }
}
