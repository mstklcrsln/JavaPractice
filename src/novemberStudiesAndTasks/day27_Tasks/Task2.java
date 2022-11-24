package novemberStudiesAndTasks.day27_Tasks;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        int [] arr = {10, 20, 30, 40, 50};
        int [] arr1= swap(arr, 2,4);
        System.out.println(Arrays.toString(arr1)); //[10, 20, 50, 40, 30]

        System.out.println("------------------");

        double [] arr2 = {100, 200, 300, 400, 500};
        double [] arr3 = swap1(arr2,0,4);
        System.out.println(Arrays.toString(arr3)); //[500.0, 200.0, 300.0, 400.0, 100.0]


    }
    public static int [] swap (int [] array, int i, int j){
       int tempElement= array[i];
       array [i] = array [j];
       array [j]= tempElement;
       return array;
    }

    public static double [] swap1 (double[] arr1, int element1, int element2){
        double tempElement = arr1 [element1];
        arr1 [element1] = arr1 [element2];
        arr1 [element2] = tempElement;
        return arr1;
    }

}
/*
2. Swap Task:
	2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j.
	the method swaps the element at index i with the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

	2.2 Create the same function for double array, char array and string array

 */