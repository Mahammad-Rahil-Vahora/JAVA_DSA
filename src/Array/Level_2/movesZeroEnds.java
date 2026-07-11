public class movesZeroEnds {
   public static void main(String[] args) {
        int [] arr ={1,0,2,0,3,4};
        int n = arr.length;
//        int i = 0;
        int j = 0;
//        while(i < n){
//            if(arr[i] != 0){
//                int temp = arr[i];
//                arr[i]= arr[j];
//                arr[j] = temp;
//                j++;
//                i++;
//            }
//            else i++;
//        }

        for(int i = 0 ; i < n ; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;
                j++;

            }
        }

        for(int k =0 ; k < n; k++){
            System.out.print(arr[k]+" ");
        }
    }
}
