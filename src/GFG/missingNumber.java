public class missingNumber {
    public static void main(String[] args) {
        int [] arr = {1,5,3,4,6,9,7,2};
        int n = arr.length + 1;
        int arrsum = 0;
        for (int i = 0; i < n-1; i++){
            arrsum += arr[i];
        }

        int sum = (n*(n+1))/2;
        int result = sum - arrsum;

        System.out.println("missing value is: " + result );
    }
}



