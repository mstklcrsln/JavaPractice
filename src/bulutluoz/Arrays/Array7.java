package bulutluoz.Arrays;

import java.util.Arrays;

public class Array7 {
    public static void main(String[] args) {

        // create a method that scroll the elements to the right and put the last element to the index 0
        // {4,5,6,7,8} ==> {8,4,5,6,7}

        int [] arr = {4,5,6,7};
       arr= scrollRight(arr);
        System.out.println(Arrays.toString(arr)); //[7, 4, 5, 6]
    }
    public static int [] scrollRight (int [] arr){
        int emptyBucket= arr[arr.length-1]; // we put the last element to an empty busket

        // we put the the element in the
        // index 0 to the index 1
        // first index to the secon index
        // second index to the third index,
        //third index to the fourth
        //.... so we use for loop

        for (int i = arr.length-2; i >=0 ; i--) {
            arr[i+1]= arr [i]; // we assign the indexes like the above
            // at the and of the loop our array is [4,4,5,6]
            //we put the last element which is in the emptyBusket to the index 0
      }
        arr[0] =emptyBucket;
        return arr;
    }
}

