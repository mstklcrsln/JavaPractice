package wiseJavaCourse.ArrayListStudies;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSetMethod {
    public static void main(String[] args) {

        int [] arr = {1,22,2,3,5,4,8,9,7,4,1,8,7};

        // set method deletes old value and changes the given element/value

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) { // we put the elements to a array
            numbers.add(arr[i]);
        }
        System.out.println(numbers.set(0, 8)); // gives the old value of index 0 ==> 1

        numbers.set(0,8);       // changes the index 0 to 8
        System.out.println(numbers); //[8, 22, 2, 3, 5, 4, 8, 9, 7, 4, 1, 8, 7]

        int oldValue=  numbers.set(1,9); // oldValue is 22
        System.out.println(oldValue);
      numbers.set(1,9);       // changes the index 1 to 9
        System.out.println(numbers); //[8, 9, 2, 3, 5, 4, 8, 9, 7, 4, 1, 8, 7]
        }
}

