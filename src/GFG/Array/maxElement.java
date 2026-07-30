public class maxElement {
    public static void main(String[] args) {
        int [] arr = {2,3,-1,-4,-3,57,89};
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("max is: "+ max);
    }
}
