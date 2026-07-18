package Binary_Search;

import java.util.ArrayList;

public class firstAndLastPositionOfEle{
    static void main(String[] args) {
        int [] arr = {1,3,5,5,5,5,67,123,125};
        int target = 5;
        ArrayList <Integer> ans = find(arr,target);
        System.out.println(ans);
    }
   public static ArrayList <Integer> find(int [] arr, int target){
        ArrayList <Integer> ans = new ArrayList <> ();
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int index1 = -1;

        while(low <= high){
            int mid = (low+high) / 2;

            if(arr[mid] > target) {
                high = mid - 1;
            }
            if (arr[mid]< target) {
                low = mid + 1;
            }
            else{
                index1 = mid;
                high = mid -1;
            }
        }
        ans.add(index1);

        low = 0;
        high = n-1;
        int  index2 = -1;

        while(low <= high){
            int mid = (low+high) / 2;

            if(arr[mid] > target) {
                high = mid - 1;
            }
            if (arr[mid]< target) {
                low = mid + 1;
            }
            else{
                index2 = mid;
                low = mid + 1;
            }
        }
        ans.add(index2-1);
        return ans;
    }
}
