package Array.Level_4;

public class equilibriumIndex {
    static void main(String[] args) {
        int [] arr = {1,3,5,3,5,2,2};
        int n = arr.length;

        //METHOD 1
//        int total = 0;
//        for (int i = 0; i < n; i++) {
//            total += arr[i];
//        }
//
//        int left = 0;
//        for (int i = 0; i < n; i++) {
//            total -= arr[i];
//            if(left == total){
//                System.out.println(i);
//            }
//            left += arr[i];
//        }

        //METHOD 2
        int [] left = new int [n];
        left[0] = 0;
        int lsum = 0;
        for (int i = 1; i < n; i++) {
            lsum += arr[i-1];
            left[i] = left[i-1] + arr[i-1];

        }

        int [] right = new int [n];
        right[n-1] = 0;
        int rsum = 0;
        for (int i = n-2; i >= 0; i--) {
            rsum += arr[i+1];
            right[i] = right[i+1] + arr[i+1];

        }

        int [] ans = new int [n];
        for (int j = 1; j < n; j++) {
            if(left[j] == right[j]){
                System.out.println(j);
            }
        }
    }
}
