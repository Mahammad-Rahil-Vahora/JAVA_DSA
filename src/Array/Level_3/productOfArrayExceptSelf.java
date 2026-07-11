public class productOfArrayExceptSelf {
//    public static void main(String[] args) {
//        int [] arr = {2,3,4,5}; //[60,40,30,24]
//        int n = arr.length;
//        int [] ans = new int [n];
//        int product = 1;
//        for (int i = 0; i < n; i++) {
//            product *= arr[i];
//        }
//
//        for(int i = 0; i < n; i++){
//            ans[i] = product / arr[i];
//            System.out.println(ans[i]);
//        }
//    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5}; //[60,40,30,24]
        int n = arr.length;
        int[] ans = new int[n];
        int product = 1;
        int [] left = new int[n];
        int [] right = new int[n];

        left[0] = product;
        for (int i = 1; i < n; i++) {
            left[i] = arr[i-1] * left[i-1];
        }
        print(left);

        right[n-1] = product;
        for (int i = n-2; i >= 0; i--) {
            right[i] = arr[i+1] * right[i+1];
        }
        print(right);

        for (int i = 0; i < n; i++) {
            ans[i] = left[i] * right[i];
        }
        print(ans);
    }

    public static void print(int [] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
