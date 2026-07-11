public class findDuplicate {
    public static void main(String[] args) {
        int [] arr = {1,2,3,9};
        int ans = Duplicate(arr);
        System.out.println("Duplicate Element is: " + ans);
    }

    public static int Duplicate (int [] arr){
        int n = arr.length;
        for(int i = 0 ; i < n; i++){
            for(int j = i+1 ; j< n; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
