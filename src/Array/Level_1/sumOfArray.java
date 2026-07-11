public class sumOfArray {
    public static void main(String[] args) {
        int [] arr ={1,7,20,6,25,10,12};
        int ans = sumis(arr);
        System.out.println("sum is:" + ans);
    }

    public static int sumis(int [] arr){
        int n = arr.length;
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        return sum;
    }
}
