package Binary_Search;

public class searchInsertPosition {
    static void main(String[] args) {
        int [] arr = {1,3,5,6};
        int target = 0;
        int ans = insertPosition(arr,target);
        System.out.println(ans);
    }
    public static int insertPosition(int [] arr, int target){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int index = -1;

        while(low <= high){
            int mid = (low+high) / 2;

            if (arr[mid]< target) {
                low = mid + 1;
            }
            else{ //arr[mid] >= target
                index = mid;
                high = mid -1;
            }
        }
        return index;
    }
}
