public class secondMaximum {
    public static void main(String[] args) {
        int [] arr = {2,3,-1,-4,-3,57,89};
        int max = arr[0];
        int smax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("max is: "+ max);

        for(int i = 0; i < arr.length; i++){
            if(smax < arr[i] && arr[i] != max){
                smax = arr[i];
            }
        }
        System.out.println("Second max is: "+ smax);
    }
}
