package Binary_Search;

public class searchInRotatedArrray_II {
    static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        int target = 2;

        boolean ans = search(arr,target);
        System.out.println(ans);
    }

    public static boolean search (int [] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n-1;

        while (low <= high){
            int mid = low + (high-low)/2;

            if (arr[mid] == target) return true;

            if(arr[low] < arr[mid]){
                if(arr[low] <= target && target < arr[mid]) high = mid - 1;
                else low = mid + 1;
            }
            else {
                if(arr[mid] > target && target <= arr[high]) low = mid + 1;
                else high = mid - 1;
            }
        }

        return false;
    }

}
