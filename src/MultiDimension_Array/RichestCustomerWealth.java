package MultiDimension_Array;

public class RichestCustomerWealth {
    static void main(String[] args) {
//        int [][] arr = {{1,2,3},{3,2,1}}; // 6
        int [][] arr = {{1,5},{7,3},{3,5}}; // 10

        int ans = maximum(arr);
        System.out.println(ans);
    }

    public static int maximum(int [][] arr) {

        int  max = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
            if(sum > max) max = sum;
        }
        return max;
    }
}
