public class printTwoSum {
    public static void main(String[] args) {
        int [] arr = {1,5,7,8};
        int target = 8;
        twosum(arr,target);
    }

    public static boolean twosum(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1;j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("yes");
                    return true;
                }
            }
        }
        System.out.println("no");
        return false;

    }
}
