package Binary_Search;

public class kTHmissingPositiveNumber {
    static void main(String[] args) {

        int [] arr = {2,3,4,7,11};
        int k = 5; //9
//        int [] arr = {1,2,3,5}; int  k=3;

        int ans = searchMissingEle(arr,k);
        System.out.println(ans);
    }

    public static int searchMissingEle (int [] arr,int k) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int nMissingEle = 0;

        while (low <= high){
            int mid = low + (high-low)/2;

            nMissingEle = arr[mid] - (mid + 1);
            if (nMissingEle < k) low = mid + 1;
            else high = mid - 1;
        }

        return  low + k; // high + 1 + k
    }
}
