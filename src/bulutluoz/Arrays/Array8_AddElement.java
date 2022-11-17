package bulutluoz.Arrays;

import java.util.Arrays;

public class Array8_AddElement {
    public static void main(String[] args) {

        int [] arr = {2,4,6};

        int [] arr2= new int[arr.length+1]; // [0,0,0,0] // cearete a new array has 1 plus length,
        for (int i = 0; i < arr.length; i++) {
            arr2[i]= arr[i];        // assign arr i index to the arr2
        }
        System.out.println(Arrays.toString(arr2)); //[2, 4, 6, 0]

        //assign the adding element to the last index of the new array
        arr2[arr2.length-1] =8;
        System.out.println(Arrays.toString(arr2)); //[2, 4, 6, 8]
        arr= arr2;
        System.out.println(Arrays.toString(arr)); //[2, 4, 6, 8]

     //   arr= addElementToArray(arr,25);
       // System.out.println(Arrays.toString(arr)); //[2, 4, 6, 8, 25]
    }
    // create a method for adding element to an array
    public static int [] addElementToAnArray (int [] arr, int num){
        int [] newArray = new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            newArray[i]= arr[i];
        }
        newArray[newArray.length-1]= num;
        return newArray;
    }
}
