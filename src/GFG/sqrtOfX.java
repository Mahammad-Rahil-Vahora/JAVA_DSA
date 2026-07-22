package GFG;

public class sqrtOfX {
    public static void main(String[] args) {
        int X = 16;
        int ans = sqrt(X);
        System.out.println(ans);
    }

    public static int sqrt(int n) {

        int low = 0;
        int high = n - 1;
        int index = -1;

        if(n == 0 || n == 1) return n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid <= n/mid) {
                index = mid;
                low = mid + 1;
//                System.out.println(index);
            } else {
                high = mid - 1;
            }
        }
        return index;
    }
}
