package NovemberStudiesAndTasks.day22.day22_Tasks;

import java.util.Arrays;

public class ReverseTwoDimensionalArray {
    public static void main(String[] args) {

        int [][] arr = { {1,2,3}, {4,5,6}};

        int[][] reversed = new int[arr.length][arr[1].length];

        for (int i = arr.length-1; i>=0; i--) {
            for (int j = arr[i].length-1; j >=0; j--) {
                reversed[arr.length-1-i][arr[i].length-1-j]=arr[i][j]; //6
               // System.out.print(reversed[arr.length-1-i][arr[i].length-1-j]+ " ");
            }
        }
        System.out.println(Arrays.deepToString(reversed)); //[[6, 5, 4], [3, 2, 1]]

    }
}
/*
1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};

		output:
			reverse = { {6,5,4}, {3,2,1},};
			public static void main(String[] args) {

         int [][] arr = { {1,2,3}, {4,5,6}};
        int[][] reversed = new int[arr.length][arr[1].length];
        for (int i = arr.length-1; i>=0; i--) {
            for (int j = arr[i].length-1; j >=0; j--) {
                    reversed[arr.length-1-i][arr[i].length-1-j]=arr[i][j]; //6
                System.out.print(reversed[arr.length-1-i][arr[i].length-1-j]+ " ");
            }
            }
        System.out.println(Arrays.deepToString(reversed));

        }

            }
        }

        System.out.println(Arrays.deepToString(reverse));
 */