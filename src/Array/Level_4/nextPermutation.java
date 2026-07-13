package Array.Level_4;

public class nextPermutation {
    static void main(String[] args) {
        int [] arr = {1,2,3,5,4};
        int n = arr.length;
        int pivot = -1;

        for(int i = n-2 ; i >= 0; i--){
            if(arr[i] < arr[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot == -1){
            reverse(arr,-1);
        }


        for(int i = n-1; i > pivot; i--){
            if(arr[i] > arr[pivot]) {
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
                reverse(arr,pivot);
                break;
            }
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void reverse (int [] arr, int pivot) {
        int n = arr.length;
        int i = pivot + 1;
        int j = n-1;

        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
