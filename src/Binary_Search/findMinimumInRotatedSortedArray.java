package Binary_Search;

public class findMinimumInRotatedSortedArray {
    static void main(String[] args) {
        int [] arr = {6,7,0,1,2,4,5};

        int ans = searchMinimum(arr);
        System.out.println(ans);
    }

    public static int searchMinimum (int [] arr) {
        int n = arr.length;
        int low = 0;
        int high = n-1;

        while (low < high){
            int mid = low + (high-low)/2;
            if (arr[mid] > arr[high]) low = mid + 1;
            else high = mid;
        }
        return arr[low];
    }
}
