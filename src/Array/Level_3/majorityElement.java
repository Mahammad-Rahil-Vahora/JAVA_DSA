public class majorityElement {
    public static void main(String[] args) {
        int [] arr = {2,2,1,1,1,1,2,2};
        int ans = majority(arr);
        System.out.println("Majority Element is: " + ans);
    }

    public static int majority (int [] arr){
        int n = arr.length;
        for(int i = 0 ; i < n; i++){
            int count = 0;
            for(int j = 0 ; j< n; j++){
                if(arr[i] == arr[j]){
                    count ++;
                }
            }
            if(count > n/2){
                return arr[i];
            }
        }
        return 0;
    }
}
