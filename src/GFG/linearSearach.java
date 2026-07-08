import java.util.Scanner;

public class linearSearach {
    public static void main(String[] args) {
        int [] arr = {12,1,20,6,7,7,18,45};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to found in array: ");
        int target = sc.nextInt();
        int found = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                found = i;
                break;
            }
        }
        if(found != -1){
            System.out.println("Element is found at index:" + found);
        }
        else{
            System.out.println("Element is not found.");
        }
    }
}
