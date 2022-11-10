package novemberStudiesAndTasks.day24_Tasks;

import java.util.Arrays;

public class Task6_AddElement {

    public static void main(String[] args) {
        int [] arr ={1,2,3};
        int [] result= addElement(arr,5);
        System.out.println("result = " + Arrays.toString(result));
    }
    public static int [] addElement (int [] array, int number){
        int [] result= new int [array.length+1];
        int i=0;
        for (int eachNumber : array) {
            result[i++]= eachNumber;
        }
        result[i]= number;
        return result;
    }
}

/*
6. create a method named addElement that takes one integer array and one integer, the method can add the Integer number after the  last index of the integer array and returns the new array
    			Ex:

    				num = 4;
    				addElement(arr, num) ==> {1,2,3,4}
 */