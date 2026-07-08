public class productOfElements {
    public static void main(String[] args) {
        int [] arr = {2,3,-1,-4,-3,-5,9};
        int pro = 1;
        for(int i = 0; i < arr.length; i++){
            pro *= arr[i];
        }
        System.out.println("product is: "+ pro);
    }
}
