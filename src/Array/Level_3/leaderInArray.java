import java.util.ArrayList;
import java.util.Collections;

public class leaderInArray {
    public static void main(String[] args) {
        int [] arr ={16,17,4,3,5,2};
//        17,5,2
        int n = arr.length;
        ArrayList <Integer> rseult = ledaerFind (arr);
//        int result = ledaerFind (arr);
        System.out.println(rseult);
    }

    public static ArrayList <Integer> ledaerFind (int [] arr) // public static int ledaerFind (int [] arr)
    {
        ArrayList <Integer> ans = new ArrayList <> ();
        int n = arr.length;
        int max = arr[n-1];
        ans.add(max); // this line is compulsory write
        for(int i = n-2; i >= 0; i--){
            if(max <= arr[i]){
                max = arr[i];
                ans.add(max);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
