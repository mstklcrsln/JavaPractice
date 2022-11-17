package wiseJavaCourse.ArrayListStudies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTask1 {
    public static void main(String[] args) {

        // delete the repeated elements from array
        int [] arr = {1,1,2,2,3,3,5,5,5,4,8,8,9,7,8,8,4,1,8,744,4,4,7};

        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) { // we put the elements to a array
            if (!newList.contains( arr[i] )){
            newList.add(arr[i]);
            }
        }
        System.out.println(newList); //[1, 2, 3, 5, 4, 8, 9, 7, 744]

        // to assign the elements to the old array we use for loop again
        arr = new int[newList.size()];
        for (int i = 0; i <arr.length ; i++) { // we put the elements to the arr
            arr[i]= newList.get(i); // put the newList's i index to the arr's indexes starting from 0
        }
        System.out.println(Arrays.toString(arr)); //[1, 2, 3, 5, 4, 8, 9, 7, 744]
    }
}
