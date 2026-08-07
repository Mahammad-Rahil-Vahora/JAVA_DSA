package Array.Level_4;

public class maximumProductSubArray {
    static void main(String[] args) {
        int [] nums = {2,3,-2,4};
//        op : 6    2,3
        int n = nums.length;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int product = 1;

            for (int j = i; j < n; j++) {
                product *= nums[j];
                ans = Math.max(ans, product);
            }
        }
        System.out.println(ans);
    }
}
