public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 7, 20, 6, 25, 10, 12};
        int n = arr.length;
        System.out.println("Original Array is: ");
        print(arr);
        System.out.println();
        reverse(arr);
        System.out.println("Reverse Array is: ");
        print(arr);
    }

    public static void print(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverse(int [] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
