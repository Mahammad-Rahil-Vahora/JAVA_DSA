public class maximumElement {
    public static void main(String[] args) {
        int [] arr ={1,7,20,6,25,10,12};
        int ans = maximum(arr);
        System.out.println("max is: " + ans);
    }

    public static int maximum(int [] arr){
        int n = arr.length;
        int max = arr[0];
        for(int i = 0; i < n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
