package wiseJavaCourse.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        // create an array for user
        // create a method that get array length, array elements from user

       int [] array= createArray();

        System.out.println(Arrays.toString(array)); //[1, 2, 5, 6, 2]
    }

    public static int [] createArray (){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length= scan.nextInt();
        int [] userArray = new int[length]; // we get the length of the array from user

        for (int i = 0; i <length ; i++) {
            System.out.println("Enter one number for add the array");
            userArray[i] = scan.nextInt(); // the user enter the numbers and ths code will put them to the new array with index
        }
        return userArray;
    }
}
