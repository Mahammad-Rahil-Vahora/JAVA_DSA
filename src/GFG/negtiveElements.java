public class negtiveElements {
    public static void main(String[] args) {
        int [] arr = {2,3,-1,-4,-3,57,89};
        System.out.println("Negative elements are:");

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                System.out.println(arr[i] + " ");
            }
        }
    }
}
