package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class threeSum {
        public static void main(String[] args) {
            int[] arr = {-1, 0, 1, 2, -1, -4};

            ArrayList<ArrayList<Integer>> ans = threeSum(arr);
            System.out.println(ans);
        }

        public static ArrayList<ArrayList<Integer>> threeSum(int[] arr) {

            Arrays.sort(arr);

            ArrayList<ArrayList<Integer>> result = new ArrayList<>();

            int n = arr.length;

            for (int i = 0; i < n - 2; i++) {

                if (i > 0 && arr[i] == arr[i - 1]) {
                    continue;
                }

                int k = i + 1;
                int j = n - 1;

                while (k < j) {

                    int sum = arr[i] + arr[k] + arr[j];

                    if (sum == 0) {

                        result.add(
                                new ArrayList<>(
                                        Arrays.asList(arr[i], arr[k], arr[j])
                                )
                        );

                        k++;
                        j--;

                        while (k < j && arr[k] == arr[k - 1]) {
                            k++;
                        }

                        while (k < j && arr[j] == arr[j + 1]) {
                            j--;
                        }

                    } else if (sum < 0) {
                        k++;
                    } else {
                        j--;
                    }
                }
            }

            return result;
        }
    }
