package Binary_Search;

public class binarySearch {
    static void main(String[] args) {
        int [] arr = {1,3,5,8,9,10,16};
        int target = 10;
        int ans = bs(arr,target);
        System.out.println(ans);
    }
    public static int bs(int [] arr, int target){
        int n = arr.length;
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = (low+high) / 2;

            if(arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}
