package Binary_Search;

public class peakIndexInMountainArray {
    static void main(String[] args) {
        int [] arr = {1,2,3,5,6,7,9,11,6,4};
        int ans = findPeakIndex(arr);
        System.out.println(ans);
    }

    public static int findPeakIndex (int [] arr) {
        int n = arr.length;
        int low = 1;
        int high = n-2;

        while(low <= high){
            int mid = (low+high) / 2;

            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) {
                return mid;
            }
            else if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]) {
                low  = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return 0;
    }

}
