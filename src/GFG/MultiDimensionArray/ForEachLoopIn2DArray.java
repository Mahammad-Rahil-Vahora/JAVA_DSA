package GFG.MultiDimensionArray;

public class ForEachLoopIn2DArray {
    static void main(String[] args) {
        int [][] matrix = {{6,9,20,5},{1,4,19,8},{2,4,5,90}};

        //METHOD 1
        for (int i = 0; i < matrix.length; i++) {
            for (int ele :  matrix[i]) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //METHOD 2
        for (int [] arr : matrix) {
            for (int ele : arr) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
