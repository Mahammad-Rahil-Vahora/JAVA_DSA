public class rotateArrayBy1 {
    public static void main(String[] args) {
        int [] arr ={1,0,2,0,3,4};
        int n = arr.length; // 6

        System.out.println("Real array:");
        print(arr);

        int temp = arr[0];
        // left rotate
        for(int i = 0; i < n-1 ; i++){// 5
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
        System.out.println("left rotate arry:");
        print(arr);



        int [] brr ={1,0,2,0,3,4};
        int m = brr.length; // 6

        int tem = brr[m-1];

        for(int i = m-1; i > 0 ; i--){// 5
            brr[i] = brr[i-1];
        }
        brr[0] = tem;
        System.out.println("right rotate arry:");
        print(brr);
    }

    public static void print(int [] arr){
        for(int k =0 ; k < arr.length; k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println(" ");
    }
}
