public class secondLargestElement {
    public static void main(String[] args) {
        int [] arr ={1,7,20,6,25,10,12};
        int ans = secondMax(arr);
        System.out.println("SecondMaximum is: " + ans);
    }

    public static int secondMax(int [] arr){
        int n = arr.length;
        int max = arr[0];
        int secMax = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        for(int i = 0; i < n; i++){
            if(secMax < arr[i] && arr[i] != max){
                secMax = arr[i];
            }
        }
        return secMax;
    }
}
