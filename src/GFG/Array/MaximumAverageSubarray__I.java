package GFG.Array;

public class MaximumAverageSubarray__I {
    static void main(String[] args) {
        int [] arr = {1,12,-5,-6,50,3};
        int k = 4;

        int i = 0;
        int j = 0;
        int sum = 0;

        double maxsum = Double.NEGATIVE_INFINITY;

        while (j < arr.length) {
            sum += arr[j];
            if (j - i + 1 < k) {
                j++;
            }
            else if (j - i + 1 == k) {
                maxsum = Math.max(maxsum, sum);
                sum -= arr[i];
                i++;
                j++;
            }
        }
        System.out.println(maxsum/k);
    }
}
