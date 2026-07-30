public class minElement {
    public static void main(String[] args) {
        int [] arr = {2,3,-1,-4,-3,57,89};
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("min is: "+ min);
    }
}
