public class countEvenOdd {
    public static void main(String[] args) {
        int [] arr ={1,7,20,6,25,10,12};
        int[] ans = count(arr);

        System.out.println("Even numbers: " + ans[0]);
        System.out.println("Odd numbers: " + ans[1]);
    }

    public static int[] count(int [] arr){
        int n = arr.length;
        int nOfEven = 0;
        int nOfOdd = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                nOfEven++;
            }
            else{
                nOfOdd++;
            }
        }
        int [] result = {nOfEven,nOfOdd};
        return result;
    }
}
