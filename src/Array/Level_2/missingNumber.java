package Array.Level_2;

public class missingNumber {
    public static void main(String[] args) {
        int [] arr = {1,4,2,3,7,5};
        int ans = missingnumber(arr);
        System.out.println("Missing Number is: " + ans);
    }

    public static int missingnumber (int [] arr){
        int n = arr.length+1;
        int arrSum = 0;
        for(int i = 0; i < n-1; i++){
            arrSum += arr[i];
        }

        int sum = n * (n+1) /2;
        int result = sum - arrSum;
        return result;
    }
}
