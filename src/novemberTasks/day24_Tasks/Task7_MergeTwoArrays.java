package novemberTasks.day24_Tasks;

import java.util.Arrays;

public class Task7_MergeTwoArrays {

    public static void main(String[] args) {

        int [] arr1 = {1,2,3};
        int [] arr2 = {4,5,6};
        int [] result= mergeTwoIntegerArray(arr1,arr2);
        System.out.println(Arrays.toString(result));
    }
    public static int [] mergeTwoIntegerArray (int [] arr1,int [] arr2){
        int [] addition = new int [arr1.length+arr2.length];
        for (int i = 0; i <arr1.length ; i++) {
            addition[i] = arr1[i];
        }
        for (int i = arr1.length, j=0; i <arr1.length+arr2.length ; i++, j++) {
            addition [i]= arr2[j];
        }
        return addition;
        }
    }
/*
7. Create a method named merge that passes two integer array parameters,
the method can merge two integer arrays and return the new array

				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}
					merge(arr1, arr2) ====> {1,2,3,4,5,6}
 */