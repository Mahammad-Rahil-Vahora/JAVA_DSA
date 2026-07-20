package Binary_Search;

import java.util.Arrays;

public class medianOfTwoSortedArray {
    static void main(String[] args) {

//        // METHOD 1 B.F
//        int [] a = {1,3};
//        int [] b = {2,4};
//        int n = a.length;
//        int m = b.length;
//
//        int [] c = new int [n+m];
//
//        for (int i = 0; i < n; i++) {
//            c[i] = a[i];
//        }
//        for (int i = n; i < n+m; i++) {
//            c[i] = b[i-n];
//        }
//        Arrays.sort(c);
//
//        int p = c.length;
//
//        if(p%2 == 1){
//            System.out.println(c[p/2]);
//        }
//        else {
//            System.out.println((c[p/2] + c[p/2-1])/2.0);
//        }

        // METHOD 2 Optimal Approach (Binary Search)
        int[] a = {1, 3, 7, 9, 10, 13, 21};
        int[] b = {2, 5, 7, 13, 15, 17, 20};
        double ans = median(a, b);
        System.out.println(ans);
    }

    public static double median (int [] a, int [] b){
        int n = a.length;
        int m = b.length;
        int totalLen = n + m;

        int [] smaller = n > m ? b : a;
        int [] larger = n > m ? a : b;

//        if(n > m) return median (b,a);

        int low = 0;
        int high = n;

        while (low <= high) {
            int partition_1 = (low + high) / 2;
            int partition_2 = (totalLen + 1) / 2 - partition_1;

            int l1 = partition_1 == 0 ? Integer.MIN_VALUE : smaller[partition_1 - 1];
            int r1 = partition_1 == n ? Integer.MAX_VALUE : smaller[partition_1];

            int l2 = partition_2 == 0 ? Integer.MIN_VALUE : larger[partition_2 - 1];
            int r2 = partition_2 == m ? Integer.MAX_VALUE : larger[partition_2 ];

            if(l1 <= r2 && l2 <= r1) {
                if(totalLen % 2 == 0) {
                    return (Math.max(l1,l2) + Math.min(r1,r2)) / 2.0;
                } else {
                    return Math.max(l1,l2);
                }
            }
            else if(l1 > r2) high = partition_1 - 1;
            else low = partition_1 + 1;
        }

        return 0.0;
    }
}
