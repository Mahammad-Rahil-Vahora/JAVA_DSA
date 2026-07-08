import java.util.Arrays;

public class shallowAndDeppCopy {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int [] brr = arr; // brr is a shallowcopy of arr.Acts as a pass by refernce
        brr[0] = 10; // element is change

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");

        int [] crr = Arrays.copyOf(arr,arr.length); // crr is deepcopy of arr.Acts as a pass by value
        crr[1] = 20; //  element is not change

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");

        int [] drr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            drr[i] = arr[i]; // drr is deepcopy of arr.Acts as a pass by value
            System.out.print(drr[i]+" ");
        }
    }
}

