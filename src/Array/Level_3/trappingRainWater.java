public class trappingRainWater {
    public static void main(String[] args) {
        int [] arr = {4,2,0,3,2,5}; // 9
        int n = arr.length;
        int [] left = new int [n];
        int [] right = new int [n];
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        left[0] = arr [0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i-1],arr[i]);
        }

        right[n-1] = arr[n-1];
        for (int i = n-2; i >= 0 ; i--) {
            right[i] = Math.max(right[i+1],arr[i]);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int miniHight = Math.min(left[i],right[i]);
            int space = miniHight - arr[i];
            ans += space;
        }
        System.out.println();
        System.out.println(ans);


    }
}
