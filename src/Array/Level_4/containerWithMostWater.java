package Array.Level_4;

public class containerWithMostWater {
    static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int ans = maxWater(arr);
        System.out.println("Maximum water in container is:" + ans);
    }

    public static int maxWater(int [] arr){
        int n = arr.length;

        int i = 0;
        int j = n-1;
        int max = Integer.MIN_VALUE;

        while(i <= j) {
            int width = j - i;
            int height = Math.min(arr[i],arr[j]);
            int area = width * height;

            max = Math.max(area,max);

            if(arr[i] < arr[j]) {
                i++;
            }
            else {
                j--;
            }
        }
        return max;
    }
}
