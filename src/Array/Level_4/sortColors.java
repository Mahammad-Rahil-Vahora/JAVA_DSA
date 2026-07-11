package Array.Level_4;

public class sortColors {
    static void main(String[] args) {
        int [] arr = {2,0,2,1,1,0};
        int n = arr.length;

        int i = 0;  //used for 0 aa fixed hoy
        int k = 0;  // aa used thay current element mate alag karva
        int j = n-1; //used for 2

        while(k<=j) {

            if(arr[k] == 0) {
//              swap(arr[i],arr[k]);
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                i++;
                k++;
            }
            else if (arr[k] == 1) {
                k++;
            }
            else {  //arr[k] == 2
//              swap(arr[j],arr[k])
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                j--;
            }
        }
        for (int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
