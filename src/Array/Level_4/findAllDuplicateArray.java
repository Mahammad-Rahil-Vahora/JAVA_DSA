package Array.Level_4;

import java.util.ArrayList;

public class findAllDuplicateArray {
    static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        ArrayList <Integer> ans = Duplicate(arr);
        System.out.println("Duplicate is: " + ans);
    }

    public static ArrayList <Integer> Duplicate (int [] arr) {
        int n = arr.length;
        ArrayList <Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int index = Math.abs(arr[i])- 1;

            if(arr[index] > 0) {
                arr[index] = -arr[index];
            }
            else {  // arr[index] < 0
                ans.add(index + 1);

            }

        }
        return ans;
    }
}

