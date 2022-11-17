package wiseJavaCourse.Arrays;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {

        // add 2 to each element of an Array
        int [] arr={2,4,6,8};

        for (int i = 0; i < arr.length; i++) {
            arr[i]= arr[i]+2;
        }
        System.out.println(Arrays.toString(arr)); //[4, 6, 8, 10]

        arr= addTwo(arr);
        System.out.println(Arrays.toString(arr)); //[6, 8, 10, 12]
    }
    // we create a method
    public static int [] addTwo (int [] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]= arr[i]+2;
        }
        return arr;
    }
}
