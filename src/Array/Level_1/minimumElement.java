public class minimumElement {
    public static void main(String[] args) {
        int [] arr ={1,7,20,6,25,10,12};
        int ans = minimum(arr);
        System.out.println("minimum is: " + ans);
    }

    public static int minimum(int [] arr){
        int n = arr.length;
        int min = arr[0];
        for(int i = 0; i < n; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}

