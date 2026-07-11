public class averageOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 7, 20, 6, 25, 10, 12};

        double ans = average(arr);
        System.out.println("Average is: " + ans);
    }

    public static double average(int[] arr) {
        int sum = 0;
        int  n = arr.length;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        double avg = (double) sum / n;
        return avg;
    }

}


