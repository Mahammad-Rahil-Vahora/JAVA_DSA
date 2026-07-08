import java.util.Scanner;

public class segretate0sAnd1s {
    public static void main(String[] args) {
        // METHOD 1
        System.out.println("Enter array element only 1 and 0: ");
        Scanner sc = new Scanner (System.in);
        int [] arr = new int[7];
        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Real Array:");
        print(arr);
        int i = 0;
        int j = n-1;

        while(i < j){
            if (arr[i] == 0) i++;
            else if (arr[j] == 1) j--;
            else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        System.out.println("Final array:");
        print(arr);

        // METHOD 2
//        int [] arr = {0,0,1,1,1,0,1};
//        int nzero = 0;
//        int none = 0;
//        int n = arr.length;
//        for(int i = 0; i < n; i++){
//            if(arr[i] == 0) nzero++;
//            else none++;
//        }
//
//        System.out.println("Real Array:");
//        print(arr);
//
//        for(int ii = 0; ii < nzero; ii++){
//            arr[ii] = 0;
//        }
//
//        for(int ij = nzero; ij < n; ij++){
//            arr[ij] = 1;
//        }
//        System.out.println("Final Array:");
//        print(arr);

    }

    public static void print(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
