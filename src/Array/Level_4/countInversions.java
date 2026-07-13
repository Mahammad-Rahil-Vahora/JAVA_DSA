package Array.Level_4;

public class countInversions {
    static void main(String[] args) {
        int [] arr = {4,3,2,1};
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++){
                if(arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
