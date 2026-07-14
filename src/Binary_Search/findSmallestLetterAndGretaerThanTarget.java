//package Binary_Search;
//
//public class findSmallestLetterAndGretaerThanTarget {
//    static void main(String[] args) {
//        String [] letters = {"c", "f", "j"};
//        String target = "a";//"c"
//////        target = " c" //"f"
//
//
//        String ans = insertPosition(letters,target);
//        System.out.println(ans);
//}
//public static String insertPosition(String [] arr, String target){
//    int n = arr.length;
//    int low = 0;
//    int high = n-1;
//    int index = -1;
//
//    while(low <= high){
//        int mid = (low+high) / 2;
//
//        if (arr[mid]< target) {
//            low = mid + 1;
//        }
//        else{ //arr[mid] >= target
//            index = mid;
//            high = mid -1;
//        }
//    }
//    return index;
//}
//    }
//}
