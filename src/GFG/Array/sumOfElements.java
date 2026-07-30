public class sumOfElements {
    public static void main(String[] args) {
        int [] arr = {2,3,-1,-4,-3,57,89};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Sum is: "+ sum);
    }
}
