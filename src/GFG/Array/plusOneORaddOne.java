import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class plusOneORaddOne {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int [] arr = new int[5];
        int n = arr.length;
        System.out.println("Enter the element of Array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
//        int [] arr = {5,7,8,7};
        ArrayList <Integer> result = addone(arr);
        System.out.println("Output is :" + result);
    }

    public static ArrayList<Integer> addone(int [] arr){
        ArrayList <Integer> ans = new ArrayList <> ();
        int n = arr.length;
        int carry = 1;
        
        for(int i = n-1; i >= 0; i--){
            if(arr[i] + carry <= 9){
                ans.add(arr[i] + carry);
                carry = 0;
            }
            else{
                ans.add(0);
                carry = 1;
            }
        }
        
        if(carry == 1){
            ans.add(1);
        }
        Collections.reverse(ans);
        return ans;
        

    }
}
