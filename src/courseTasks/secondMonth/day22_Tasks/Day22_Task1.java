package courseTasks.firstMonth.secondMonth.day22_Tasks;

import java.util.Arrays;

public class Day22_Task1 {
    public static void main(String[] args) {

        int [][] arr = { {1,2,3}, {4,5,6}};
        int  [][] reversed = new int [2][];

        for (int i = arr.length-1, k=0;  i >=0 ; i--, k++) {
            reversed [k] = new int [arr[i].length];
            for (int j = arr[i].length-1, l=0 ; j >=0 ; j--,l++) {
                reversed [k][l]= arr[i][j];
            }
        }
        System.out.println(Arrays.deepToString(reversed)); //[[6, 5, 4], [3, 2, 1]]
    }
}
//   j represents the index of the two-dimensional array, m represents the index of one-dimensional array

      /* for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr[i].length - 1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
        }    System.out.println();
       */


/*
1. Write a program that can reverse a two dimensional array (return new array)
		Ex:



		output:
			reverse = { {6,5,4}, {3,2,1},};

 */