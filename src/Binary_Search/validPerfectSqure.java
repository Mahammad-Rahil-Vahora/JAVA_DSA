package Binary_Search;

public class validPerfectSqure {
    public static void main(String[] args) {
        int X = 15;
        boolean ans = sqrt(X);
        System.out.println(ans);
    }

    public static boolean sqrt(int n){

        int low = 0;
        int high = n - 1;
        if(n == 0 || n == 1) return true;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid == n / mid && n % mid == 0) {
               return true;
            } else if (mid < n / mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
