package Binary_Search;

public class arrangeingCoins {
    public static void main(String[] args) {
        int n = 7;
        int ans = arrangeCoins(n);
        System.out.println(ans);
    }

//    // METHOD 1
//    public static int arrangeCoins(int n) {
//        long low = 0;
//        long high = n;
//        long ans = 0;
//
//        while (low <= high) {
//            long k = low + (high - low) / 2;
//            long m = k * (k+1) / 2;
//
//            if (m == n) return (int) k;
//            else if (m > n) high = k - 1;
//            else {
//                ans = k;
//                low = k + 1;
//            }
//        }
//        return (int) ans;
//    }



    // METHOD 2
    public static int arrangeCoins(int n) {
        long m = n;
        long ans = (sqrt(8*n+1)-1)/2;
//        long ans = (sqrt(8L * n + 1) - 1) / 2;
        return (int) ans;
    }

    public static int sqrt(int n) {
        long low = 0;
        long high = n;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (mid == n/mid) return (int)mid;
            else if (mid > n/mid) high = mid - 1;
            else low = mid + 1;

        }
        return (int) high;
    }
}
