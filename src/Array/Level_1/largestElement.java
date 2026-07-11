public class largestElement {
    public static void main(String[] args) {
        int [] arr ={1,7,20,6,25,10,12};
        int ans = largest(arr);
        System.out.println("largest element is: " + ans);
    }

    public static int largest(int [] arr){
        int n = arr.length;
        int large = arr[0];
        for(int i = 0; i < n; i++){
            if(large < arr[i]){
                large = arr[i];
            }
        }
        return large;
    }
}
