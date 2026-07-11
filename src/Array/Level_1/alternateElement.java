public class alternateElement {
    public static void main(String[] args) {
        int[] arr = {1, 7, 20, 6, 25, 10, 12};
        System.out.println("Original Array is: ");
        print(arr);
        System.out.println();
        System.out.println("Alternate Array is: ");
        alternate(arr);
    }

    public static void print(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void alternate(int [] arr){
        int n = arr.length;
        for(int i = 0; i < n; i+=2){
            System.out.print(arr[i] + " ");
        }

    }
}
