//public class rearrangeArrayAlternatively {
//    static void main(String[] args) {
//        int [] arr = {1,2,3,4,5,6,11,13,15,17};
//        int n = arr.length;
//        print(arr);
//        System.out.println();
//
//        for(int i = 0 ; i< n; i+=2){
//            int temp = arr[n-1];
//            for(int j =n-1; j > i; j--){
//                arr[j] = arr[j-1];
//            }
//            arr[i] = temp;
//        }
//        print(arr);
//    }
//
//    public static void print(int [] arr){
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//    }
//}

//
public class rearrangeArrayAlternatively {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 11, 13, 15, 17};
        int n = arr.length;

        int[] ans = new int[n];

        int i = 0;
        int j = n - 1;
        int k = 0;

        while (i <= j) {

            // Largest element
            ans[k] = arr[j];
            k++;
            j--;

            // Smallest element
            if (i <= j) {
                ans[k] = arr[i];
            k++;
            i++;
            }
        }

        print(ans);
    }

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
