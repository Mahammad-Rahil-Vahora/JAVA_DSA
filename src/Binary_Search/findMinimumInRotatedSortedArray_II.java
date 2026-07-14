package Binary_Search;

public class findMinimumInRotatedSortedArray_II {
    static void main(String[] args) {

//        int [] arr = {2,2,2,3,0,1,2};
        int [] arr = {1,3,5};

        int ans = searchMinimum(arr);
        System.out.println(ans);
    }

    public static int searchMinimum (int [] arr) {
        int n = arr.length;
        int low = 0;
        int high = n-1;

        while (low < high){
            int mid = low + (high-low)/2;

            if (arr[mid] >= arr[high]) low = mid + 1;
            else high = mid;
        }

        return arr[low];
    }
}
