public class maxSubbArray_KadanesAlgo {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int ans = max(arr);
        System.out.println("Maximum SubArray total is: " + ans);
    }
    public static int max(int [] arr){
        int n =  arr.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            sum += arr[i];

            if(sum > maxSum){
                maxSum = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }
}


