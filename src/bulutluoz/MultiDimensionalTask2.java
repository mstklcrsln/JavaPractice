package bulutluoz;

import java.util.Arrays;

public class MultiDimensionalTask2 {
    public static void main(String[] args) {
        /*
        collect the inner array elements from the given multi dimensonal array and put the result into a new array
        */

      int [][] arr= {{2,5,6,9,},{1,2,4},{1},{9,6,6,5,8,},{2},{7,88,22}};

      int [] result= new int[arr.length];

        // we create a integer for addition of inner arrays
        int additionOfInnerArray= 0;
        for (int i = 0; i < arr.length; i++) { // controls the inner arrays which is in outer array

            additionOfInnerArray=0; //we will assign 0 to the addition integer again for the other addition
            for (int j = 0; j < arr[i].length; j++) { //controls every elements from each inner array

                additionOfInnerArray += arr[i][j];
            }
            result[i]= additionOfInnerArray;
        }
        System.out.println(Arrays.toString(result)); //[22, 7, 1, 34, 2, 117]
    }
}
