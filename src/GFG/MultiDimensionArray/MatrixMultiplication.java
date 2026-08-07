package GFG.MultiDimensionArray;

import java.util.ArrayList;

public class MatrixMultiplication {
    static void main(String[] args) {
        int [][] a = {{1,2,3},{2,3,1},{3,1,2}};
        int [][] b = {{1,2},{2,3},{3,1}};

        int m1 = a.length; // 3
        int n1 = a[0].length; // 3

        int m2 = b.length; // 3
        int n2 = b[0].length; // 2

        int [][] c = new int [m1][n2]; // [3][2]

        // Matrix Multiplication In 2D Array
        if(n1 == m2) {
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n2; j++) {
                    for (int k = 0; k < m1; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
        }

        // Print 2D Array
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

//        // 2D Array to 2D ArrayList Conversion
//        ArrayList <ArrayList<Integer>> ans = new ArrayList<>();
//
//        for (int i = 0; i < m1; i++) {
//            ArrayList <Integer> row = new ArrayList<>();
//            for (int j = 0; j < n2; j++) {
//                    row.add(c[i][j]);
//            }
//            ans.add(row);
//        }
//
//        // Print 2D ArrayList
//        for (int i = 0; i < ans.size(); i++) {
//            for (int j = 0; j < ans.get(i).size(); j++) {
//                System.out.print(ans.get(i).get(j) + " ");
//            }
//            System.out.println();
//        }

//        // Matrix Multiplication In 2D ArrayList direct
//        ArrayList <ArrayList<Integer>> ans = new ArrayList<>();
//        if(n1 == m2) {
//            for (int i = 0; i < m1; i++) {
//                ArrayList <Integer> row = new ArrayList<>();
//                for (int j = 0; j < n2; j++) {
//                    int sum = 0;
//                    for (int k = 0; k < m1; k++) {
//                       sum += a[i][k] * b[k][j];
//                    }
//                    row.add(sum);
//                }
//                ans.add(row);
//            }
//        }
//
//        // Print 2D ArrayList
//        for (int i = 0; i < ans.size(); i++) {
//            for (int j = 0; j < ans.get(i).size(); j++) {
//                System.out.print(ans.get(i).get(j) + " ");
//            }
//            System.out.println();
//        }
    }
}
