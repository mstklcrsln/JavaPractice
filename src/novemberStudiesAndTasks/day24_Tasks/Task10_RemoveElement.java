package novemberStudiesAndTasks.day24_Tasks;

import java.util.Arrays;

public class Task10_RemoveElement {

    public static void main(String[] args) {

        int [] array = {10, 20, 30, 40, 50, 60};
        int index= 3;
        int [] removed = removeIntegerElement(array,index);
        System.out.println(Arrays.toString(removed));
    }
        public static int [] removeIntegerElement (int [] arr, int index){
        int [] removed = new int [arr.length-1];
        int j=0;
            for (int i = 0; i < arr.length; i++) {
                if (i== index){
                    continue;
                }
                removed[j++]= arr[i];
            }
            return removed;
        }
}
/*
10. create a method named removeElement that passes one integer array and one integer, the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2
				removeElement(array, index) ==== {10, 20, 40, 50, 60}
 */