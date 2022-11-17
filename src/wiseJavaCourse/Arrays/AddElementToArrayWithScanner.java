package wiseJavaCourse.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArrayWithScanner {
    public static void main(String[] args) {
        // create an array with scanner user wants to enter num
        // when enter 0 scan will finish
        Scanner scan= new Scanner(System.in);
        int [] arr = {0};
        int enteredNum= 0;

        do {
            System.out.println("Enter number to add the array. \n Enter 0 for quit");
            enteredNum = scan.nextInt();

            if (arr[0]==0){ // if the index is 0, that means this is the first time user entered num
               arr[0]= enteredNum;
            }else if (enteredNum !=0 ) {
              arr=  Array8_AddElement.addElementToAnArray(arr,enteredNum); // we call the method from other class and add num to the new array
            }

        }while (enteredNum!=0); // do body will execute to the entered num is 0
        System.out.println(Arrays.toString(arr));
    }
}
