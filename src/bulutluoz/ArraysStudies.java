package bulutluoz;

import java.util.Arrays;

public class ArraysStudies {
    public static void main(String[] args) {


        int [] arr= {1,2,5,4,6,9};
        // to reach one element and update the element
        System.out.println(arr[2]); //5
        arr[3] = 20;//we changed element to 20
        System.out.println(arr[3]);  //20

        System.out.println(arr.length); //6

        //last element
        System.out.println(arr[arr.length-1]);   //9

        // for all elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " "); //1 2 5 20 6 9
        }

        System.out.println(Arrays.toString(arr)); //[1, 2, 5, 20, 6, 9]


   }
}
