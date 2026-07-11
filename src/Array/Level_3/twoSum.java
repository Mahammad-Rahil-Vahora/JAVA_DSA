public class twoSum {
    public static void main(String[] args) {
        int [] arr = {1,5,3,7};
        int target = 8;
        int [] ans = twosum(arr,target);
        System.out.println("Ans is: " + ans[0] + " " + ans[1]);
    }

    public static int [] twosum(int [] arr,int target){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    int [] reslut = {i,j};
                    return reslut;
                }
            }
        }
        int [] reslut = {-1,-1};
        return reslut;
    }
}
