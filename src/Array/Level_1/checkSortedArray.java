// METHOD 1
public class checkSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 7, 20, 6, 25, 10, 12};

        boolean flag = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false;
                break;
            }
        }

        if (flag == true)
            System.out.println("Sorted");
        else
            System.out.println("Not Sorted");
    }
}
// METHOD 2
//public class checkSortedArray {
//    public static void main(String[] args) {
//        int[] arr = {1, 7, 20, 26, 35, 40, 42};
//
//        if (sorted(arr))
//            System.out.println("Sorted");
//        else
//            System.out.println("Not Sorted");
//    }
//
//    public static boolean sorted(int[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                return false;
//            }
//        }
//        return true;
//    }
//}
