public class removeDuplicateSortedArray {
    public static void main(String[] args) {
        int [] arr = {0,0,1,1,1,2,2,3,4,5};
        int ans = duplicate(arr);
        System.out.println("Final Array size is: " + ans);
    }

    public static int duplicate(int [] arr){
        int n = arr.length;
        int j = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        return j+1;
    }
}
