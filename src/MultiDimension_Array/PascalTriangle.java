package MultiDimension_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Row: ");
        int n = sc.nextInt();

        ArrayList <ArrayList<Integer>> ans = genrate (n);
        System.out.println(ans);
    }

    public static ArrayList<ArrayList<Integer>> genrate (int n) {

        // Pascal Triangle In 2D ArrayList direct
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int value1 = ans.get(i - 1).get(j - 1);
                    int value2 = ans.get(i - 1).get(j);
                    row.add(value1 + value2);
                }
            }
            ans.add(row);
        }
        return ans;


//        // 2D Array to 2D ArrayList Conversion
//        int [][] c = new int [n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                if(j == 0 || j == i) {
//                    c[i][j] = 1;
//                }
//                else {
//                    int value1 = c[i-1][j];
//                    int value2 = c[i-1][j-1];
//                    c[i][j] = value1 + value2;
//                }
//            }
//        }
//
//        ArrayList <ArrayList<Integer>> ans = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            ArrayList <Integer> row = new ArrayList<>();
//            for (int j = 0; j <= i; j++) {
//                    row.add(c[i][j]);
//            }
//            ans.add(row);
//        }
//        return ans;
    }
}
