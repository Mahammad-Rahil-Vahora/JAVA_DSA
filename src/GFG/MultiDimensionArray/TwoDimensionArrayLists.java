package GFG.MultiDimensionArray;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoDimensionArrayLists {
    static void main(String[] args) {

        // 1D Array to ArrayList
        int [] arr1 = {1,2,3,4,5,6};
        ArrayList <Integer> list1 = new ArrayList <> ();

        for( int ele : arr1)
            list1.add(ele);

        System.out.println(list1);
        System.out.println(list1.get(2));
        System.out.println();

        // 2D Array to ArrayList
        int [][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
        ArrayList <ArrayList<Integer>> list2 = new ArrayList <> ();

        for (int i = 0; i < arr2.length; i++) {
            ArrayList <Integer> row = new ArrayList <> ();
            for (int j = 0; j < arr2[i].length; j++) {
                row.add(arr2[i][j]);
            }
            list2.add(row);
        }

        System.out.println("Print ArrayList Like Matrix: ");
        for (int i = 0; i < list2.size(); i++) {
            for (int j = 0; j < list2.get(i).size(); j++) {
                System.out.print(list2.get(i).get(j) + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Print ArrayList Like Matrix Using foreach Loop
        System.out.println("Print ArrayList Like Matrix Using foreach Loop: ");
        for (ArrayList <Integer> arr : list2) {
            for (int ele : arr){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Print ArrayList In One Line: ");
        System.out.println(list2);
        System.out.println();

        System.out.println(list2.get(1).get(2));
        System.out.println();

        // To change Element in 2D Array by using both get and set.
        list2.get(0).set(2,30);
        System.out.println(list2);
        System.out.println(list2.get(0).get(2));
        System.out.println();

        // To add Element in 2D Array by using both get and add.
        list2.get(2).add(3,10);
        System.out.println(list2);
        System.out.println(list2.get(2).get(3));
        System.out.println();

        // To add new blank ArrayList
        list2.add(new ArrayList<>());
        System.out.println(list2);
        System.out.println();


    }
}
