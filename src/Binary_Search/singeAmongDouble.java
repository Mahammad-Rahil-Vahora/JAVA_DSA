package Binary_Search;

public class singeAmongDouble {
    static void main(String[] args) {
        int [] arr = {1,1,2,2,3,3,4,8,8};
        int ans = findSingleEle(arr);
        System.out.println(ans);

    }

    public static int findSingleEle (int [] arr) {
        int n = arr. length;
        int i = 0;
        int j = n-1;

        while (i<=j){
            int mid = (i+j)/2;

            if(arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1]){
                return mid;
            }
            else { //if(arr[mid] == arr[mid+1] || arr[mid] == arr[mid-1])
                int f = mid, s = mid;
                if(arr[mid] == arr[mid+1]) s = mid+1;
                else f = mid -1;
                int lc = f-i;
                int rc = j-s;

                if(lc % 2 == 0) i = mid + 1;
                else j = mid -1;
            }

        }
        return 0;
    }
}
