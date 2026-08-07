package MultiDimension_Array;

import java.util.*;

public class PascalTriangle__II {
    static void main(String[] args) {
        int rowIndex = 3;
//        Output: [1,3,3,1]

//        int rowIndex = 0;
//        Output: [1]

//        int rowIndex = 1;
//        Output: [1,1]

        List<Integer> ans = getRow (rowIndex);
        System.out.println(ans);
    }

    public static List<Integer> getRow(int rowIndex) {

        // Pascal Triangle In 2D ArrayList direct (Easy method)
        int n = rowIndex + 1;
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
        return ans.get(rowIndex);


//        // 2D Array to 2D ArrayList Conversion
//        int n = rowIndex + 1;
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
//        return ans.get(rowIndex);
    }
}
